package com.widedelivery.test.widedelivery.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/")
class HelloController {
    @GetMapping("/hello")
    fun helloWorld(): ResponseEntity<String> = ResponseEntity.ok("Hello world")
}
