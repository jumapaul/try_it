package com.juma.locallist.ui

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

inline fun <reified A> String.fromJson(): A{
    val type = object : TypeToken<A>(){}.type
    return Gson().fromJson(this, type)
}

fun <A> A.toJson(): String?{
    return Gson().toJson(this)
}