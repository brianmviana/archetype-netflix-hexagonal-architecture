package "\${groupId}".transportlayers.converter

import "\${groupId}".entities.GitRepo
import "\${groupId}".transportlayers.data.response.Repository

fun GitRepo.convertToDTO() = Repository(
    name = this.name,
    fullName = this.fullName,
    description = this.description?.takeIf { it.isNotEmpty() }
)