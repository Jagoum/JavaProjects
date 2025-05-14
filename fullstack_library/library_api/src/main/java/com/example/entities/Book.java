package com.example.entities;

public class Book {
    static int id;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.author = author;
        this.title = title;
    }

    public void setId(int i) {

        id = i;
    }

    public Integer getId() {

        return id + 1;
    }
}
