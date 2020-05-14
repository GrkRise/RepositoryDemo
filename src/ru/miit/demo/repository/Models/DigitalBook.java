package ru.miit.demo.repository.Models;

public class DigitalBook extends Book {
    public DigitalBook(Long id, String title, int pages) {
        super(id, title, "digital", pages);
    }
}
