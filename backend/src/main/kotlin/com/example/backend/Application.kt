package com.example.backend

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun main() {
    embeddedServer(Netty, port = 8080) {
        install(ContentNegotiation) {
            json()
        }
        routing {
            get("/") {
                call.respondText("KMM Ktor Backend is running!")
            }
            post("/login/google") {
                // parse google token from request (not implemented)
                call.respond(mapOf("success" to true, "provider" to "google"))
            }
            post("/login/facebook") {
                // parse facebook token from request (not implemented)
                call.respond(mapOf("success" to true, "provider" to "facebook"))
            }
        }
    }.start(wait = true)
}
