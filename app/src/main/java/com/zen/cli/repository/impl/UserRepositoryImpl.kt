package com.zen.cli.repository.impl

import com.zen.cli.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUserList(): List<String> {
        //please return a list of user with unique names
        return listOf("user1", "user2", "user3")
    }
}