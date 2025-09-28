package com.example.app.auth.data.repository

import com.example.app.auth.data.local.AuthDataStore
import com.example.app.auth.domain.model.User
import com.example.app.auth.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class AuthRepositoryImpl(
    private val authDataStore: AuthDataStore
) : AuthRepository {

    override suspend fun signup(user: User) {
        authDataStore.saveUser(user.email, user.password)
    }

    override suspend fun login(email: String, password: String): Boolean {
        var success = false
        authDataStore.userEmail.map { storedEmail ->
            authDataStore.userPassword.map { storedPassword ->
                success = storedEmail == email && storedPassword == password
            }
        }
        return success
    }

    override fun getUser(): Flow<User?> {
        return authDataStore.userEmail.map { email ->
            if (email != null) {
                User(email, "") // don’t expose password
            } else null
        }
    }

    override suspend fun logout() {
        authDataStore.clearUser()
    }
}
