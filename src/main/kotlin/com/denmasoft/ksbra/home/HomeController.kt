package com.denmasoft.ksbra.home

import com.denmasoft.ksbra.models.UserModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun home(): String {
        return "home"
    }

    @GetMapping("/users")
    @ResponseBody
    fun users(): UserModel {
        return UserModel(1,"Alfred Thomson")
    }

}