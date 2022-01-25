package com.graphql.repository

import com.graphql.dsg.model.Users
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
interface UserRepository : CrudRepository<Users, String> {

    @Query("select * from users")
    fun getAllUsers(): List<Users>

    fun findByName(name: String): List<Users>
}
