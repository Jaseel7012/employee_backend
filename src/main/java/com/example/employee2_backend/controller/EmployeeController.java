package com.example.employee2_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String HomePage(){
        return "home page";
    }
    @GetMapping("/add")
    public String EmployeeAdd(){
        return  "employee add page";
    }
}
