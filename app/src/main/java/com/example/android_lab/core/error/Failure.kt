package com.example.android_lab.core.error

sealed class Failure(val message: String) {
    object NetworkError : Failure("Network Error")
    object UnknownError : Failure("Unknown Error")
}
