package com.example.app.auth.domain.usecase

import com.example.app.auth.domain.model.User
import com.example.app.auth.domain.repository.AuthRepository

class SignupUseCase(private val repository: AuthRepository) {
    suspend operator fun invoke(user: User) {
        repository.signup(user)
    }
}
