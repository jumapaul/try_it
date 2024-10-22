package com.juma.locallist.ui


data class Brand(
    var name: String,
    var brandListing: List<BrandListings>
)

data class BrandListings(
    var name: String
)

