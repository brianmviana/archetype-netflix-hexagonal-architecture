package "\${groupId}".entities

data class GitRepo (
    val name: String,
    val fullName: String,
    var description: String?,
)
