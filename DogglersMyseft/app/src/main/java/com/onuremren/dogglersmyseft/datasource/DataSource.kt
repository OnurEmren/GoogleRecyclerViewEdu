package com.onuremren.dogglersmyseft.datasource

import com.onuremren.dogglersmyseft.R
import com.onuremren.dogglersmyseft.model.Dog

object DataSource {
    fun loadDogs(): List<Dog>{
        return listOf(
            Dog(R.drawable.bella,
                "Bella",
                "2",
                "sunbathing"),
            Dog(R.drawable.faye,
                "Faye",
                "3",
                "sleeping in dangerous places"),
            Dog(R.drawable.frankie,
                "Frankie",
                "4",
                "play Football"),
            Dog(R.drawable.leroy,
                "Leroy",
                "1",
                "stealing socks"),
            Dog(R.drawable.nox,
                "Nox",
                "5",
                "meeting new animals"),
            Dog(R.drawable.tzeitel,
                "Tzeitel",
                "3",
                "Digging in the garden"
            )
        )


    }

}