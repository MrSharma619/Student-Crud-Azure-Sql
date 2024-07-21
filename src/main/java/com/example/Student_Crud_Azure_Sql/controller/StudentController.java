package com.example.Student_Crud_Azure_Sql.controller;

import com.example.Student_Crud_Azure_Sql.dto.StudentDto;
import com.example.Student_Crud_Azure_Sql.entity.Student;
import com.example.Student_Crud_Azure_Sql.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents(){

        List<Student> students = repository.findAll();

        return new ResponseEntity<>(students, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody StudentDto dto){

        Student student = new Student(
                UUID.randomUUID(),
                dto.getFullName(),
                dto.getCity(),
                dto.getPhoneNumber()
        );

        repository.save(student);

        return new ResponseEntity<>(student, HttpStatus.CREATED);

    }

}
