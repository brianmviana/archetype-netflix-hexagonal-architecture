package ${groupId}.interactors

import ${groupId}.entities.GitRepo
import ${groupId}.repositories.GitRepoRepository
import org.springframework.stereotype.Service

@Service
class GetGitRepositoryByOwnerUseCase(val gitRepoRepository: GitRepoRepository) {

    fun execute(username: String): MutableList<GitRepo> {
        return this.gitRepoRepository.getGitRepoListByOwner(username)
    }

}
