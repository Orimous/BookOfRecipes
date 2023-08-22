package com.orimous.bookofrecipes.ui.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.orimous.bookofrecipes.R
import com.orimous.bookofrecipes.dishes.MoroccanDishes

@Composable
fun MoroccanPage() {
    val MoroccanDishes = listOf(
        MoroccanDishes.Couscous,
        MoroccanDishes.Tagine,
        MoroccanDishes.MintTea
    )
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(MoroccanDishes) { moroccanDish ->
            MoroccanDishCard(moroccanDish)
        }
    }
}

@Composable
fun MoroccanDishCard(
    moroccanDish: MoroccanDishes
) {
    Card(
        modifier = Modifier
            .width(140.dp)
            .height(140.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(moroccanDish.dishImage),
                contentDescription = moroccanDish.title,
                modifier = Modifier.size(90.dp)
            )
            Text(
                text = moroccanDish.title,
                fontFamily = FontFamily(Font(R.font.merriweather_light)),
                fontSize = 16.sp,
                color = Color.Black
            )
        }
    }
}