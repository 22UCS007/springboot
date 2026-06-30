package com.sagnik.springjdbcex.web;

import com.sagnik.springjdbcex.model.Student;
import com.sagnik.springjdbcex.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getStudents();
    }

    @PostMapping(consumes = "application/x-www-form-urlencoded")
    public String addStudent(Student student) {
        service.addStudent(student);
        return "Student added!";
    }
}
