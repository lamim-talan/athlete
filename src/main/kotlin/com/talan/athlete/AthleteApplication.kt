package com.talan.athlete

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class AthleteApplication

fun main(args: Array<String>) {
    runApplication<AthleteApplication>(*args)
}
