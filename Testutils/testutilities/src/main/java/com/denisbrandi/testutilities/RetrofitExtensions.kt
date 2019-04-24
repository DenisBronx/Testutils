package com.denisbrandi.testutilities

import com.google.gson.Gson
import okhttp3.mockwebserver.MockWebServer
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

fun Retrofit.Builder.createTestRetrofit(server: MockWebServer): Retrofit {
    return addConverterFactory(GsonConverterFactory.create(Gson()))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(server.url("/"))
        .build()
}