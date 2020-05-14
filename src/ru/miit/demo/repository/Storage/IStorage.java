package ru.miit.demo.repository.Storage;

import ru.miit.demo.repository.Models.Book;

import java.util.List;

public interface IStorage<T> {
    void addBook(T t);
    void deleteBook(T t);
    void updateBook(T t);

    List<T> getBooks(String type);
    List<T> getBooks();
}
