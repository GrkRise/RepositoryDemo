package ru.miit.demo.repository.Repository;

import ru.miit.demo.repository.Models.DigitalBook;

import java.util.List;

public interface ITypedBookRepository<T> {
    void addBook(T t);
    void deleteBook(T t);
    void updateBook(T t);

    List<DigitalBook> getBooks(String type);
}
