package com.iqmsoft.server.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("api")
class ApiController {

    
    @RequestMapping(method = [RequestMethod.GET], path = ["/hello"])
    fun getHello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return "Hello $name now is ${LocalDateTime.now()}!\n"
    }
}