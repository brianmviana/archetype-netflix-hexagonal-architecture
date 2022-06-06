package ${packageId}.interactors

import ${packageId}.entities.GitRepo
import ${packageId}.repositories.GitRepoRepository
import org.springframework.stereotype.Service

@Service
class GetGitRepositoryByOwnerUseCase(val gitRepoRepository: GitRepoRepository) {

    fun execute(username: String): MutableList<GitRepo> {
        return this.gitRepoRepository.getGitRepoListByOwner(username)
    }

}
