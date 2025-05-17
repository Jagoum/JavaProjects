package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.db.LibraryDB;
import com.example.entities.Book;
import com.google.gson.Gson;

// LibraryServlet.java
@WebServlet("/books")
public class LibraryServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("application/json");
        PrintWriter out = res.getWriter();
        out.print(new Gson().toJson(LibraryDB.getAllBooks())); // Requires Gson library
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        LibraryDB.addBook(new Book(title, author));
        res.setStatus(201); // Created
    }

    protected void doDelete(HttpServletRequest req, HttpServletResponse res) {
        int id = Integer.parseInt(req.getParameter("id"));
        LibraryDB.deleteBook(id);
        res.setStatus(204); // No Content
    }
}
