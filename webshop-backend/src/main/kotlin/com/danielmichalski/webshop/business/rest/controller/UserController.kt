package com.danielmichalski.webshop.business.rest.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.danielmichalski.webshop.business.domain.entity.user.UserEntity

@RestController
@RequestMapping(path = ["/users"])
class UserController {

    @GetMapping
    @Operation(summary = "Get all users")
    @ApiResponses(value = [
        ApiResponse(
                responseCode = "200",
                description = "Found users",
                content = [Content(
                        mediaType = MediaType.APPLICATION_JSON_VALUE,
                        schema = Schema(implementation = UserEntity::class))
                ])])
    fun listUsers() {
        // TODO implement this
        throw RuntimeException("Not implemented yet!")
    }
}
