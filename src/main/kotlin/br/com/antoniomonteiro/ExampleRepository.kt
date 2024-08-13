package br.com.antoniomonteiro

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface ExampleRepository:JpaRepository<ExampleEntity, Long>