package ru.miit.demo.repository.Repository;

import ru.miit.demo.repository.Models.Book;

import java.util.List;

public interface IBookRepository<T> {
    void addBook(T t);
    void deleteBook(T t);
    void updateBook(T t);

    List<T> getBooks();
}
