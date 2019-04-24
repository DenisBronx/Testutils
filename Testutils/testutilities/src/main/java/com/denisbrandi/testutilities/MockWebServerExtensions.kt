package com.denisbrandi.testutilities

import okhttp3.mockwebserver.Dispatcher
import okhttp3.mockwebserver.MockWebServer

fun MockWebServer.start(customDispatcher: Dispatcher): MockWebServer {
    dispatcher = customDispatcher
    start()
    return this
}