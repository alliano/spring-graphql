package com.graqhql.domains;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter @AllArgsConstructor
public class Student {

    private String id;

    private String name;

    private static AtomicInteger index = new AtomicInteger();

    public static ArrayList<Student> students = new ArrayList<>();


    public static Student getStudentById(String id) {
        return students.stream().filter(student -> student.getId().equals(id)).findFirst().orElse(null);
    }



    public static Student addStudent(String name) {
        students.add(new Student(idGenerator(), name));
        return students.get(students.size()-1);
    }

    public static List<Student> getAll(){
        return students;
    }

    public static String idGenerator(){
        return String.valueOf(index.incrementAndGet());
    }

   public String randomGenerator(){
        return UUID.randomUUID().toString();
   }
}
