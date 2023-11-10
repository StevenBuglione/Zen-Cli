package com.zen.cli.repository

interface UserRepository {
    fun getUserList(): List<String>;
}