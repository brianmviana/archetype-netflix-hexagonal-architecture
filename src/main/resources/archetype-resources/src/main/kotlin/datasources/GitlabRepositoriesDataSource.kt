package ${packageId}.datasources

import ${packageId}.datasources.services.GitlabProjectsClient
import ${packageId}.datasources.services.converter.convertToModel
import ${packageId}.datasources.services.data.response.gitlab.GitlabUserResponse
import ${packageId}.entities.GitRepo
import ${packageId}.exceptions.NotFoundException
import ${packageId}.repositories.GitRepoRepository
import org.springframework.stereotype.Component

@Component
class GitlabRepositoriesDataSource(
    val gitlabProjectsClient: GitlabProjectsClient
): GitRepoRepository {

    private val gitlabUserCache: HashMap<String, GitlabUserResponse> = HashMap()

    override fun getGitRepoListByOwner(username: String): MutableList<GitRepo> {
        val repoList = mutableListOf<GitRepo>()
        val gitlabUserId: Int = this.getGitlabUserByUsername(username).id
        val repos = this.gitlabProjectsClient.getProjectsByNameAndUserId(gitlabUserId)
        repos.forEach {
            repoList.add(it.convertToModel())
        }
        return repoList
    }

    private fun getGitlabUserByUsername(username: String): GitlabUserResponse {
        return this.gitlabProjectsClient.getUsersByUsername(username)
            .stream()
            .findFirst()
            .orElseThrow { NotFoundException() }
    }

}
