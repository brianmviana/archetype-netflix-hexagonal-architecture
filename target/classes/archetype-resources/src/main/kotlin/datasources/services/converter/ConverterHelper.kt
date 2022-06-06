package ${groupId}.datasources.services.converter

import ${groupId}.datasources.services.data.response.github.GithubReporitoryResponse
import ${groupId}.datasources.services.data.response.gitlab.GitlabProjectResponse
import ${groupId}.entities.GitRepo

fun GithubReporitoryResponse.convertToModel() = GitRepo(
    name = this.name,
    fullName = this.fullName,
    description = this.description?.takeIf { it.isNotEmpty() }
)

fun GitlabProjectResponse.convertToModel() = GitRepo(
    name = this.name,
    fullName = this.pathWithNamespace,
    description = this.description?.takeIf { it.isNotEmpty() }
)
