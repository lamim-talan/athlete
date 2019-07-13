package com.talan.athlete

import org.springframework.stereotype.Service

@Service
class AthleteService {

    private val allAthletes = listOf(
            Athlete(name = "DANIEL CORMIER", division = "POUND-FOR-POUND", championship = Championship("UFC")),
            Athlete(name = "MAX HOLLOWAY", division = "POIDS PLUME", championship = Championship("UFC")),
            Athlete(name = "JOSE ALDO", division = "POIDS PLUME", championship = Championship("UFC")),
            Athlete(name = "KAMARU USMAN", division = "WELTERWEIGHT", championship = Championship("UFC")),
            Athlete(name = "KHABIB NURMAGOMEDOV", division = "POIDS LÉGER", championship = Championship("UFC")),
            Athlete(name = "ISRAEL ADESANYA", division = "MIDDLEWEIGHT", championship = Championship("UFC")),
            Athlete(name = "ANDERSON SILVA", division = "MIDDLEWEIGHT", championship = Championship("UFC")),
            Athlete(name = "SAM-A GAIYANGHADAO", division = "MIDDLEWEIGHT", championship = Championship("ONE")),
            Athlete(name = "RODTANG JITMUANGNON", division = "MIDDLEWEIGHT", championship = Championship("ONE")),
            Athlete(name = "SAEMAPETCH FAIRTEX", division = "MIDDLEWEIGHT", championship = Championship("ONE")),
            Athlete(name = "SAMY SANA", division = "MIDDLEWEIGHT", championship = Championship("ONE")),
            Athlete(name = "YODSANKLAI IWE FAIRTEX", division = "MIDDLEWEIGHT", championship = Championship("ONE")),
            Athlete(name = "RYAN BADER", division = "LIGHT HEAVYWEIGHT", championship = Championship("BELLATOR")),
            Athlete(name = "RORY MACDONALD", division = "WELTERWEIGHT", championship = Championship("BELLATOR")),
            Athlete(name = "JULIA BUDD", division = "WOMEN'S FEATHERWEIGHT", championship = Championship("BELLATOR")),
            Athlete(name = "ILIMA-LEI MACFARLANE", division = "WOMEN'S FLYWEIGHT", championship = Championship("BELLATOR")),
            Athlete(name = "PATRICIO PITBULL", division = "FEATHERWEIGHT", championship = Championship("BELLATOR"))
    )

    fun getAllAthletes(): List<Athlete> = allAthletes

    fun getAllAthletesBy(championship: String) =
            allAthletes.filter { athlete -> athlete.championship.title == championship }

}
