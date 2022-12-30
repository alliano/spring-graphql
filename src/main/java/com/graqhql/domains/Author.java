package com.graqhql.domains;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class Author {

    private String id;

    private String firstName;

    private String lastName;

    private static List<Author> authors = Arrays.asList(
    new Author("1", "alliano", "alfarez"),
    new Author("2", "madara", "uchiha"),
    new Author("3", "uzumaki", "naruto"),
    new Author("4", "Denji", "kusuma putri"),
    new Author("5", "sasuke", "uchiha")
    );

    public static Author getById(String id) {
        return authors.stream().filter( author -> author.getId().equals(id)).findFirst().orElse(null);
    }
}
