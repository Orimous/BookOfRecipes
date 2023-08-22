package com.orimous.bookofrecipes.dishes

import com.orimous.bookofrecipes.R


sealed class IndianDishes(
    val dishImage: Int,
    val title: String,
    val desc: String,
    val route: String
) {
    object BombayPotato: IndianDishes(
        R.drawable.bombay_potato,
        "Bombay Potato",
        "",
        "bombay_potato"
    )
    object Puri: IndianDishes(
        R.drawable.puri,
        "Puri",
        "",
        "puri"
    )
    object ButterChicken: IndianDishes(
        R.drawable.butter_chicken,
        "Butter chicken",
        "",
        "butter_chicken"
    )
    object KulfiFalooda: IndianDishes(
        R.drawable.kulfi_falooda,
        "Kulfi falooda",
        "",
        "kulfi_falooda"
    )

}