package ru.miit.demo.repository.Repository;

import ru.miit.demo.repository.Models.Book;
import ru.miit.demo.repository.Storage.IStorage;

import java.util.List;

public class BookRepository extends AbstractRepository implements IBookRepository<Book>{


    public BookRepository(IStorage storage) {
        super(storage);
    }

    @Override
    public void addBook(Book book) {
        storage.addBook(book);
    }

    @Override
    public void deleteBook(Book book) {
        storage.deleteBook(book);
    }

    @Override
    public void updateBook(Book book) {
        storage.updateBook(book);
    }

    @Override
    public List<Book> getBooks() {
        return storage.getBooks();
    }
}
