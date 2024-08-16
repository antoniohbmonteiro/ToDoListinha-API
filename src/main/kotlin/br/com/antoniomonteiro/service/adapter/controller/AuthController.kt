package br.com.antoniomonteiro.service.adapter.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.micronaut.views.View

@Controller("/")
//@Secured(SecurityRule.IS_AUTHENTICATED)
class AuthController {

    @Get("/")
    @Secured(SecurityRule.IS_ANONYMOUS)
    @View("home")
    fun index(): Map<String, Any> {
        return mapOf("message" to "You are logged in!")
    }
}