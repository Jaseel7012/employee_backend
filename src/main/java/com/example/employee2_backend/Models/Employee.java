package com.example.employee2_backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private int emp_code;
    private String comp_name;
    private String desi;
    private int salary;
    private String emp_name;
    private  String mobile_no;
    private String username;
    private String pswrd;

    public Employee() {
    }

    public Employee(int id, int emp_code, String comp_name, String desi, int salary, String emp_name, String mobile_no, String username, String pswrd) {
        this.id = id;
        this.emp_code = emp_code;
        this.comp_name = comp_name;
        this.desi = desi;
        this.salary = salary;
        this.emp_name = emp_name;
        this.mobile_no = mobile_no;
        this.username = username;
        this.pswrd = pswrd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(int emp_code) {
        this.emp_code = emp_code;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getDesi() {
        return desi;
    }

    public void setDesi(String desi) {
        this.desi = desi;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswrd() {
        return pswrd;
    }

    public void setPswrd(String pswrd) {
        this.pswrd = pswrd;
    }


}
