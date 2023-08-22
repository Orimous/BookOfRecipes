package com.orimous.bookofrecipes.dishes

import com.orimous.bookofrecipes.R


sealed class FrenchDishes(
    val dishImage: Int,
    val title: String,
    val desc: String,
    val route: String
) {
    object Croissant : FrenchDishes(
        R.drawable.croissant,
        "Croissant",
        "",
        "croissant"
    )
    object Baguette : FrenchDishes(
        R.drawable.baguette,
        "Baguette",
        "",
        "baguette"
    )
    object Ratatouille : FrenchDishes(
        R.drawable.ratatouille,
        "Ratatouille",
        "",
        "ratatouille"
    )
}