package com.rodrigo.springbootrestapi.controller;

import com.rodrigo.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "João", "Silva"));
        students.add(new Student(2, "Silva", "João"));
        students.add(new Student(2, "Marcos", "Santos"));
        students.add(new Student(2, "Carla", "Silva"));
        return students;
    }
}
