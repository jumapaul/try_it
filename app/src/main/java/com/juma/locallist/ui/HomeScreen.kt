package com.juma.locallist.ui

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.juma.locallist.ui.composables.BrandItem
import com.juma.locallist.ui.navigation.Routes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SuspiciousIndentation")
@Composable
fun HomeScreen(
    navController: NavController
){
    var myData = listOf(
        Brand(
            name = "Adidas",
            brandListing = listOf(
                BrandListings(name = "Adidas1"),
                BrandListings(name = "Adidas2"),
                BrandListings(name = "Adidas3"),
                BrandListings(name = "Adidas4"),
                BrandListings(name = "Adidas5"),
                BrandListings(name = "Adidas6"),
                BrandListings(name = "Adidas7"),
            )
        ),
        Brand(
            name = "Airforce",
            brandListing = listOf(
                BrandListings(name = "Airforce1"),
                BrandListings(name = "Airforce2"),
                BrandListings(name = "Airforce3"),
                BrandListings(name = "Airforce4"),
                BrandListings(name = "Airforce5"),
                BrandListings(name = "Airforce6"),
                BrandListings(name = "Airforce7"),
            )
        ),
        Brand(
            name = "Jaaz",
            brandListing = listOf(
                BrandListings(name = "Jaaz1"),
                BrandListings(name = "Jaaz2"),
                BrandListings(name = "Jaaz3"),
                BrandListings(name = "Jaaz4"),
                BrandListings(name = "Jaaz5"),
                BrandListings(name = "Jaaz6"),
                BrandListings(name = "Jaaz7"),
            )
        ),
    )

    Scaffold{
        val context = LocalContext.current
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(26.dp)
        ) {
            items(myData.size){index->
                val singleItem = myData[index]
                BrandItem(
                    onClick = {
                        val brandItem = singleItem.brandListing.toJson()

                        Log.d("------>", "HomeScreen: $brandItem")
                          navController.navigate(Routes.Details.routes + "/$brandItem")
                    },
                    name = singleItem.name)
            }
        }
    }
}