package com.gay3.demo.rest;

import com.gay3.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;
    //@PostConstruct to load the student data....Only once..
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Gayathri", "Sugumar"));
        theStudents.add(new Student("Louisa", "Merlin"));
        theStudents.add(new Student("Maga", "Lakshmi"));

    }

    // define endpoint for "/students" -return a list of student
    @GetMapping("/students")
    public List<Student> getStudent(){
        return theStudents;
    }

    // define endpoint or "/students/{studentId}" -return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        //just index into list

        //check stud Id
        if ( (studentId >= theStudents.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student id not found -" +studentId);
        }

        return theStudents.get(studentId);
    }


}
