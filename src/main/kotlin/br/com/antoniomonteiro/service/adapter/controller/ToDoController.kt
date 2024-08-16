package br.com.antoniomonteiro.service.adapter.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*

@Controller("/to-do")
class ToDoController {

    @Get("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getById(id: Long): String {
        return "getById: $id"
    }

    @Get
    @Produces(MediaType.TEXT_PLAIN)
    fun getAll(): String {
        return "getAll"
    }

    @Put
    @Produces(MediaType.TEXT_PLAIN)
    fun update(): String {
        return "update"
    }

    @Delete("/{id]")
    @Produces(MediaType.TEXT_PLAIN)
    fun delete(id: Long): String {
        return "delete: $id"
    }

    @Post
    @Produces(MediaType.TEXT_PLAIN)
    fun create(): String {
        return "create"
    }

}