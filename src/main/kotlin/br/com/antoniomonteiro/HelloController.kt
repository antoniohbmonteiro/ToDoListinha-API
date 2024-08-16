package br.com.antoniomonteiro

import com.nimbusds.jose.proc.SecurityContext
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*
import jakarta.inject.Inject
import java.security.Principal

@Controller("/hello")
class HelloController(private val exampleRepository: ExampleRepository,
                      @Inject val securityContext: SecurityContext
) {

    @Get
    @Secured(SecurityRule.IS_AUTHENTICATED)
    @Produces(MediaType.TEXT_PLAIN)
    fun get(): String {

//        val authentication = securityContext.authentication
//        val token = authentication?.credentials as? String // Isso assume que o token está armazenado como uma String

        return "Hello World"
    }

    @Post(consumes = [MediaType.APPLICATION_JSON], produces = [MediaType.APPLICATION_JSON])
    fun createUser(@Body user: ExampleEntity): HttpResponse<ExampleEntity> {
        val savedUser = exampleRepository.save(user)
        return HttpResponse.created(savedUser)
    }
}
