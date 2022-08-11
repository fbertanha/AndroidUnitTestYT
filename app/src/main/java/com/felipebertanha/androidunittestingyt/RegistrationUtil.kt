package com.felipebertanha.androidunittestingyt

/**
 * Created by felipebertanha on 11/August/2022
 */
object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl", "John")

    /** the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real one
     * */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        return true
    }
}