package com.healthfy.sujan.healthfy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/getUsers")
    public ResponseEntity<String> getUser()
    {
        return new ResponseEntity<>("The users have been returned",HttpStatus.OK);
    }

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser()
    {
        return new ResponseEntity<>("The users have been returned",HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser()
    {
        return new ResponseEntity<>("The users have been logged in",HttpStatus.OK);
    }

}
