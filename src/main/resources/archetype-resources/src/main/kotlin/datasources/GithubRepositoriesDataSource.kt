package "\${groupId}".datasources

import "\${groupId}".datasources.services.GithubRepositoriesClient
import "\${groupId}".datasources.services.data.response.github.GithubReporitoryResponse
import "\${groupId}".datasources.services.converter.convertToModel
import "\${groupId}".entities.GitRepo
import "\${groupId}".exceptions.InternalServerErrorException
import "\${groupId}".exceptions.NotFoundException
import "\${groupId}".repositories.GitRepoRepository
import feign.FeignException
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component
import org.springframework.http.HttpStatus.NOT_FOUND

@Component
@Primary
class GithubRepositoriesDataSource(
    val githubRepositoriesClient: GithubRepositoriesClient
): GitRepoRepository {

    override fun getGitRepoListByOwner(username: String): MutableList<GitRepo> {
        val repos: MutableList<GithubReporitoryResponse>
        try {
            repos = this.githubRepositoriesClient.getGitReposByOwner(username)
        } catch (e: FeignException) {
            e.printStackTrace()
            if (NOT_FOUND.value() == e.status()) {
                throw NotFoundException("The owner could not be found.")
            }
            throw InternalServerErrorException()
        }
        var repoList = mutableListOf<GitRepo>()
        repos.forEach {
            repoList.add(it.convertToModel())
        }
        return repoList
    }

}
