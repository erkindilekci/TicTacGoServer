package com.erkindilekci.plugins

import com.erkindilekci.models.TicTacGoGame
import com.erkindilekci.socket
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting(game: TicTacGoGame) {
    routing {
        socket(game)
    }
}
