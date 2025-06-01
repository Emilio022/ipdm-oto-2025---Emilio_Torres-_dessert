/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.Dessert

/**
 * [Datasource] generates a list of [Dessert]
 */
object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.cupcake, 1, 0),
        Dessert(R.drawable.donut, 2, 5),
        Dessert(R.drawable.eclair, 3, 10),
        Dessert(R.drawable.froyo, 4, 20),
        Dessert(R.drawable.gingerbread, 5, 30),
        Dessert(R.drawable.honeycomb, 6, 40),
        Dessert(R.drawable.icecreamsandwich, 7, 50),
        Dessert(R.drawable.jellybean, 8, 60),
        Dessert(R.drawable.kitkat, 9, 70),
        Dessert(R.drawable.lollipop, 10, 80),
        Dessert(R.drawable.marshmallow, 11, 90),
        Dessert(R.drawable.nougat, 12, 100),
        Dessert(R.drawable.oreo, 6000, 20000)
    )
}
/*
*       Dessert(R.drawable.dessert_1, price = 1, startProductionAmount = 0), // Cambia 5 a 1
        Dessert(R.drawable.dessert_2, price = 2, startProductionAmount = 5), // Cambia 10 a 2
        Dessert(R.drawable.dessert_3, price = 3, startProductionAmount = 10), // Cambia 20 a 3
        Dessert(R.drawable.dessert_4, price = 4, startProductionAmount = 20), // Cambia 30 a 4
        Dessert(R.drawable.dessert_5, price = 5, startProductionAmount = 30), // Cambia 50 a 5
        Dessert(R.drawable.dessert_6, price = 6, startProductionAmount = 40), // Cambia 70 a 6
        Dessert(R.drawable.dessert_7, price = 7, startProductionAmount = 50), // Cambia 80 a 7
        Dessert(R.drawable.dessert_8, price = 8, startProductionAmount = 60), // Cambia 90 a 8
        Dessert(R.drawable.dessert_9, price = 9, startProductionAmount = 70), // Cambia 100 a 9
        Dessert(R.drawable.dessert_10, price = 10, startProductionAmount = 80), // Cambia 120 a 10
        Dessert(R.drawable.dessert_11, price = 11, startProductionAmount = 90), // Cambia 140 a 11
        Dessert(R.drawable.dessert_12, price = 12, startProductionAmount = 100), // Cambia 150 a 12*/