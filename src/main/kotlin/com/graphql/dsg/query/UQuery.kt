package com.graphql.dsg.query

import com.graphql.dsg.model.Users
import com.netflix.graphql.dgs.InputArgument
import org.springframework.stereotype.Component

@Component
interface UQuery {
    fun getAllUsers(@InputArgument titleFilter: String?): List<Users>

}
