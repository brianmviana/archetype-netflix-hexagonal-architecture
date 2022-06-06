package ${packageId}.datasources

import ${packageId}.datasources.services.GithubRepositoriesClient
import ${packageId}.datasources.services.data.response.github.GithubReporitoryResponse
import ${packageId}.datasources.services.converter.convertToModel
import ${packageId}.entities.GitRepo
import ${packageId}.exceptions.InternalServerErrorException
import ${packageId}.exceptions.NotFoundException
import ${packageId}.repositories.GitRepoRepository
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
