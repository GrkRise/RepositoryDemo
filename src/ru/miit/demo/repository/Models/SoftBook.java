package ru.miit.demo.repository.Models;

public class SoftBook extends Book {


    public SoftBook(Long id, String title, int pages) {
        super(id, title, "soft", pages);
    }

}