package com.juma.locallist.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BrandItem(
    name: String,
    onClick: () -> Unit
) {
    Text(
        modifier = Modifier.clickable {
            onClick()
        },
        text = name
    )
}