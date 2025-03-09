package com.example.securitydemo;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String sayHello()
    {
        return "hello";
    }
    @GetMapping("/hi")
    public String say()
    {
        return "hi";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String user()
    {
        return "user enpoint";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String admin()
    {
        return "admin endpoint";
    }

}
