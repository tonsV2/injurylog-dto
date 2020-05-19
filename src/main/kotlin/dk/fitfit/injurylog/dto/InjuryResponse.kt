package dk.fitfit.injurylog.dto

import java.time.LocalDateTime

class InjuryResponse(
        val description: String,
        val occurredAt: LocalDateTime,
        val loggedAt: LocalDateTime,
        val imageReferenceIds: List<Long>,
        val tags: List<TagResponse>,
        val id: Long,
        val created: LocalDateTime,
        val updated: LocalDateTime
)
