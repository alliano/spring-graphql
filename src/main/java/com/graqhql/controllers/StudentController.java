package com.graqhql.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.ContextValue;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graqhql.domains.Student;

@Controller
public class StudentController {

    @QueryMapping
    public Student getStudentBiId( @Argument String id) {
        return Student.getStudentById(id);
    }

    @MutationMapping
    public Student addStudent( @Argument String name) {
        return Student.addStudent(name);
    }

    @QueryMapping
    public List<Student> getStudents(@ContextValue Map<String, List<String>> heders){
        System.out.println(heders);
        return Student.getAll();
    }
}
