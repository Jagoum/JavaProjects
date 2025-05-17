package com.example.entities;

public class Book {
    int id;
    String title;
    String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id + 1;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
