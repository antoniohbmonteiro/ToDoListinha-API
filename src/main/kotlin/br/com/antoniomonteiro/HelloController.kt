package br.com.antoniomonteiro

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@Controller("/hello")
class HelloController {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun get(): String {
        return "Hello World!"
    }

}
