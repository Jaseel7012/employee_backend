package com.example.employee2_backend.controller;

import com.example.employee2_backend.Models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/")
    public String HomePage(){
        return "home page";
    }
    @PostMapping (path="/add",consumes = "application/json" , produces = "application/json")
    public String EmployeeAdd(@RequestBody Employee e){
        System.out.println(e.getUsername().toString());
        return  "employee add page";
    }

    @GetMapping("/view")

    public String EmployeeView(){
        return  "Employee view";
    }
    @PostMapping("/delete")
    public String EmployeeDelete(){
        return  "delete employee page";
    }
    @PostMapping("/edit")
    public  String EmployeeEdit(){
        return  "edit page";
    }
    @PostMapping("/search")
    public  String EmployeeSearch(){
        return "search page";
    }
}
