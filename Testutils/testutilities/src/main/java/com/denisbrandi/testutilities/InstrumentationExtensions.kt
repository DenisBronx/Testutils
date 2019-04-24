package com.denisbrandi.testutilities

import android.app.Instrumentation

fun Instrumentation.getJsonFromAssets(path: String): String {
    return context.assets.open(path).bufferedReader().readText()
}