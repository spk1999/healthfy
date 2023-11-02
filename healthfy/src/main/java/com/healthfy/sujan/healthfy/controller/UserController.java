package com.healthfy.sujan.healthfy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<String> getUser()
    {
        return new ResponseEntity<>("The users have been returned",HttpStatus.OK);
    }

}
