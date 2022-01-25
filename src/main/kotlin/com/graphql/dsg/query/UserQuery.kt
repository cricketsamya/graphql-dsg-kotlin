package com.graphql.dsg.query

import com.graphql.dsg.model.Users
import com.graphql.repository.UserRepository
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import org.springframework.stereotype.Component

@DgsComponent
class UserQuery(private val userService: UserRepository) : UQuery {

    @DgsQuery
    override fun getAllUsers(@InputArgument titleFilter: String?): List<Users> {
        return userService.getAllUsers()
    }
}
