package ${packageId}.transportlayers.converter

import ${packageId}.entities.GitRepo
import ${packageId}.transportlayers.data.response.Repository

fun GitRepo.convertToDTO() = Repository(
    name = this.name,
    fullName = this.fullName,
    description = this.description?.takeIf { it.isNotEmpty() }
)