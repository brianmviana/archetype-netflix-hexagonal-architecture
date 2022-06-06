package ${packageId}.repositories

import ${packageId}.entities.GitRepo

interface GitRepoRepository {

    fun getGitRepoListByOwner(username: String) : MutableList<GitRepo>

}
