package com.example.taskmanager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@AllArgsConstructor
// @NoArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {



    @GetMapping()
public ResponseEntity<String> test() {
    return ResponseEntity.ok("Test endpoint works!");
}
    

    @PostMapping("/register")
    public String register() {
        System.out.println("Register method called");
        return "Method called";
    }
    

}
