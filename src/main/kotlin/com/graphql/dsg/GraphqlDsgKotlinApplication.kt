package com.graphql.dsg

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(
    basePackages = ["com.graphql.dsg"]
)
class GraphqlDsgKotlinApplication

fun main(args: Array<String>) {
    runApplication<GraphqlDsgKotlinApplication>(*args)
}
