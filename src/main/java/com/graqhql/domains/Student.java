package com.graqhql.domains;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public class Student {

    private String id;

    private String name;

    public static List<Student> students = Arrays.asList(
        new Student("1", "alliano"),
        new Student("2", "desti"),
        new Student("3", "sasuke"),
        new Student("4", "uciha madara")
    );

    public static Student getStudentById(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }
}
