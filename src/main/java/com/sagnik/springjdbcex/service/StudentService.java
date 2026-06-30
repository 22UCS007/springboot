package com.sagnik.springjdbcex.service;

import com.sagnik.springjdbcex.model.Student;
import com.sagnik.springjdbcex.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    private StudentRepo repo;
    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    @Transactional
    public void addStudent(Student s){
        repo.save(s);

//        if(true) throw new RuntimeException("Simulated exception to test transaction rollback");
//        for logs
        String details="Student added with rollno: "+s.getRollNo();
        repo.logInsert(details);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }
}
