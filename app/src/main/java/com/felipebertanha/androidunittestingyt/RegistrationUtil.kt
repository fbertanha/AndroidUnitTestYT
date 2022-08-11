package com.felipebertanha.androidunittestingyt

/**
 * Created by felipebertanha on 11/August/2022
 */
object RegistrationUtil {

    private const val DIGITS_REQUIRED = 2

    private val existingUsers = listOf("Peter", "Carl", "John")

    /** the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real one
     * ...the password contains less than 2 digits
     * */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) return false
        if(username in existingUsers) return false
        if(password.count { it.isDigit() } < DIGITS_REQUIRED) return false
        return password == confirmedPassword
    }
}