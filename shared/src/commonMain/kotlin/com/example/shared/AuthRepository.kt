package com.example.shared

import kotlinx.coroutines.*

class AuthRepository {
    suspend fun loginWithGoogle(token: String): Boolean {
        // TODO: integrate Google sign-in; for now, returns true as a placeholder
        return true
    }

    suspend fun loginWithFacebook(token: String): Boolean {
        // TODO: integrate Facebook sign-in; for now, returns true as a placeholder
        return true
    }
}
