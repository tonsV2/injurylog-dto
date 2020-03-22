package dk.fitfit.injurylog.dto

import org.junit.Test
import kotlin.test.assertEquals

internal class CredentialsTest {

    @Test
    fun `Create entity`() {
        val username = "username"
        val password = "password"

        val credentials = Credentials(username, password)

        assertEquals(username, credentials.username)
        assertEquals(password, credentials.password)
    }
}
