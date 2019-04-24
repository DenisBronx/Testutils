package com.denisbrandi.testutilities

import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.RecordedRequest

class CustomDispatcher(private val code: Int = 200, private val body: String) : Dispatcher() {

    override fun dispatch(request: RecordedRequest?): MockResponse {
        return MockResponse().setResponseCode(code).setBody(body)
    }

}