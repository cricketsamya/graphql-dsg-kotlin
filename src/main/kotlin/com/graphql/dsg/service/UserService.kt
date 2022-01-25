package com.graphql.service

import com.graphql.dsg.model.Users
import com.graphql.repository.UserRepository
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(private val repository: UserRepository) {

    fun deleteUser(id: String): Users? {
        var user = repository.findById(id)
        if (user.isPresent) {
            repository.deleteById(id)
        }
        return user.get()
    }

    fun save(user: Users): Users? = repository.save(user)
    fun findById(id: String): Optional<Users> = repository.findById(id)
    fun getAllUsers(): List<Users> = repository.getAllUsers()
    fun findByName(name: String): List<Users> = repository.findByName(name)

}
