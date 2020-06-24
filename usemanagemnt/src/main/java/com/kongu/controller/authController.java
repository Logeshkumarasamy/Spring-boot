package com.kongu.controller;

import com.kongu.Service.authService;
import com.kongu.model.Userprofile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authController {
    @Autowired
    authService authService;

@PostMapping("/userProfile")
    public Userprofile showUser(@RequestBody Userprofile Userprofile){
    return authService.showUser(Userprofile);
}

}
