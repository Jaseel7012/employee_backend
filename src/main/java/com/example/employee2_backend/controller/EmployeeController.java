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
    @GetMapping("/view")

    public String EmployeeView(){
        return  "Employee view";
    }
    @GetMapping("/delete")
    public String EmployeeDelete(){
        return  "delete employee page";
    }
    @GetMapping("/edit")
    public  String EmployeeEdit(){
        return  "edit page";
    }
    @GetMapping("/search")
    public  String EmployeeSearch(){
        return "search page";
    }
}
