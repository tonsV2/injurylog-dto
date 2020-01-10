package dk.fitfit.injurylog.dto

import com.fasterxml.jackson.annotation.JsonProperty

class LoginResponse(
        @JsonProperty("access_token") val accessToken: String,
        @JsonProperty("expires_in") val expiresIn: Int,
        @JsonProperty("refresh_token") val refreshToken: String,
        @JsonProperty("token_type") val tokenType: String,
        @JsonProperty("username") val username: String)
