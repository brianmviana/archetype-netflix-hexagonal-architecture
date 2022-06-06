package ${groupId}.datasources.services.data.response.github

import com.fasterxml.jackson.annotation.JsonProperty

data class GithubReporitoryResponse(
    val stargazersCount: Int? = 0,
    @JsonProperty("is_template") val isTemplate: Boolean? = false,
    val pushedAt: String? = "",
    val subscriptionUrl: String? = "",
    val language: String? = null,
    val branchesUrl: String? = "",
    val issueCommentUrl: String? = "",
    val labelsUrl: String? = "",
    val subscribersUrl: String? = "",
    val permissions: GithubPermissionsResponse?,
    val releasesUrl: String? = "",
    val svnUrl: String? = "",
    val id: Int = 0,
    val archiveUrl: String? = "",
    val gitRefsUrl: String? = "",
    val forksUrl: String? = "",
    val visibility: String? = "",
    val statusesUrl: String? = "",
    val sshUrl: String? = "",
    @JsonProperty("full_name") val fullName: String = "",
    val size: Int? = 0,
    val templateRepository: String? = null,
    val languagesUrl: String? = "",
    val htmlUrl: String? = "",
    val collaboratorsUrl: String? = "",
    val cloneUrl: String? = "",
    val name: String = "",
    val pullsUrl: String? = "",
    val defaultBranch: String? = "",
    val hooksUrl: String? = "",
    val treesUrl: String? = "",
    val tagsUrl: String? = "",
    @JsonProperty("private") val _private: Boolean? = false,
    val contributorsUrl: String? = "",
    val hasDownloads: Boolean? = false,
    val notificationsUrl: String? = "",
    val openIssuesCount: Int? = 0,
    val description: String? = "",
    val createdAt: String? = "",
    val deploymentsUrl: String? = "",
    val keysUrl: String? = "",
    val hasProjects: Boolean? = false,
    val archived: Boolean? = false,
    val hasWiki: Boolean? = false,
    val updatedAt: String? = "",
    val commentsUrl: String? = "",
    val stargazersUrl: String? = "",
    val disabled: Boolean? = false,
    val gitUrl: String? = "",
    val hasPages: Boolean? = false,
    val owner: GithubOwnerResponse,
    val commitsUrl: String? = "",
    val compareUrl: String? = "",
    val gitCommitsUrl: String? = "",
    val topics: List<String>?,
    val blobsUrl: String? = "",
    val gitTagsUrl: String? = "",
    val mergesUrl: String? = "",
    val downloadsUrl: String? = "",
    val hasIssues: Boolean? = false,
    val url: String? = "",
    val contentsUrl: String? = "",
    val mirrorUrl: String? = "",
    val milestonesUrl: String? = "",
    val teamsUrl: String? = "",
    val fork: Boolean? = false,
    val issuesUrl: String? = "",
    val eventsUrl: String? = "",
    val issueEventsUrl: String? = "",
    val assigneesUrl: String? = "",
    val watchersCount: Int? = 0,
    val nodeId: String? = "",
    val homepage: String? = "",
    val forksCount: Int? = 0
)
