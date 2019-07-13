package com.talan.athlete

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AthleteController {

    private val logger: Logger = LoggerFactory.getLogger(AthleteController::class.java)

    @Autowired
    private lateinit var athleteService: AthleteService

    @GetMapping("/")
    fun getAllAthletes(): List<Athlete> = athleteService.getAllAthletes()

    @GetMapping("/{championship}")
    fun getAllAthletesBy(@PathVariable championship: String): ResponseEntity<List<Athlete>> {
        logger.info("**************** Accessing all athletes ****************")
        val allAthletes = athleteService.getAllAthletesBy(championship)
        return ResponseEntity.ok(allAthletes)
    }
}


