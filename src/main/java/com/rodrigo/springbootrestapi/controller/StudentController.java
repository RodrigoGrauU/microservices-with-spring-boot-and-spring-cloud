package com.rodrigo.springbootrestapi.controller;

import com.rodrigo.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("student")
    public Student getStudent() {
        return new Student(
                1,
                "Nome",
                "Sobrenome"
        );
    }
}
