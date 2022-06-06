package ${groupId}.repositories

import ${groupId}.entities.GitRepo

interface GitRepoRepository {

    fun getGitRepoListByOwner(username: String) : MutableList<GitRepo>

}
