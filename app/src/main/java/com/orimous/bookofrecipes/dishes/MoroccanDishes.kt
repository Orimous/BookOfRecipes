package com.orimous.bookofrecipes.dishes

import com.orimous.bookofrecipes.R

sealed class MoroccanDishes(
    val dishImage: Int,
    val title: String,
    val desc: String,
    val route: String
) {
    object Couscous : MoroccanDishes(
        R.drawable.couscous,
        "Couscous",
        "",
        "couscous"
    )
    object Tagine : MoroccanDishes(
        R.drawable.tagine,
        "Tagine",
        "",
        "tagine"
    )
    object MintTea : MoroccanDishes(
        R.drawable.mint_tea,
        "Mint Tea",
        "",
        "mint_tea"
    )
}