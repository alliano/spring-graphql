package com.graqhql.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graqhql.domains.Student;

@Controller
public class StudentController {

    @QueryMapping
    public Student getStudentBiId( @Argument String id) {
        return Student.getStudentById(id);
    }
}
