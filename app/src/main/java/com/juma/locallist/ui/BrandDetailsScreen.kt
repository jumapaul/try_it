package com.juma.locallist.ui

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.gson.Gson

@Composable
fun BrandDetailScreen(
    navController: NavController
){
    val index = navController.currentBackStackEntry?.arguments?.getString("brandItem")
    val itemsList: List<BrandListings>? = index?.fromJson()

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        itemsList?.size?.let {
            items(it){ index->
                var singleItem = itemsList[index]
                Text(text = singleItem.name)
            }
        }
    }
}