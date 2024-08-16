package br.com.antoniomonteiro.domain.repository

interface AuthRepository {
    fun login()

    fun logout()

    fun getToken(): String

    fun refreshToken(): String
}