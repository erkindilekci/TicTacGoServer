package com.erkindilekci

import com.erkindilekci.models.TicTacGoGame
import io.ktor.server.application.*
import com.erkindilekci.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val game = TicTacGoGame()
    configureMonitoring()
    configureSerialization()
    configureSockets()
    configureRouting(game)
}
