package br.com.antoniomonteiro

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@Controller("/hello")
class HelloController(private val exampleRepository: ExampleRepository) {

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun get(): String {
        return "Hello World!"
    }

    @Post(consumes = [MediaType.APPLICATION_JSON], produces = [MediaType.APPLICATION_JSON])
    fun createUser(@Body user: ExampleEntity): HttpResponse<ExampleEntity> {
        val savedUser = exampleRepository.save(user)
        return HttpResponse.created(savedUser)
    }
}
