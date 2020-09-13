package jhs.no.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces


@Controller("/")
class IndexController {

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): String {
        return "Hello World"
    }
}
