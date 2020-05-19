package dk.fitfit.injurylog.dto

import java.time.LocalDateTime

class TagResponse(
        val name: String,
        val id: Long,
        val created: LocalDateTime,
        val updated: LocalDateTime
)
