package com.example.app.auth.domain.repository

import com.example.app.auth.domain.model.User
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun signup(user: User)
    suspend fun login(email: String, password: String): Boolean
    fun getUser(): Flow<User?>
    suspend fun logout()
}
