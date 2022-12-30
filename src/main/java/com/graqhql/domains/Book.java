package com.graqhql.domains;

import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class Book {

    private String id;

    private String name;

    private int pageCount;

    private String authorId;

    private static List<Book> books = Arrays.asList(
        new Book("1", "komik Chainsaw man", 0, "1"),
        new Book("2", "komik Naruto", 0, "2"),
        new Book("3", "komik Black clover", 0, "3"),
        new Book("4", "komik Fumetsu no ananta e", 0, "4")
    );

    public static Book getById(String id) {
        return books.stream().filter(book -> book.getId().equals(id)).findFirst().orElse(null);
    }
}
