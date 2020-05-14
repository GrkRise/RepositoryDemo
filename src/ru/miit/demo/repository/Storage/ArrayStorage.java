package ru.miit.demo.repository.Storage;

import ru.miit.demo.repository.Models.Book;


import java.util.ArrayList;
import java.util.List;

public class ArrayStorage implements IStorage<Book> {
    List<Book> list = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        list.add(book);
    }

    @Override
    public void deleteBook(Book book) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(book.getId()))
                list.remove(i);
        }

    }

    @Override
    public void updateBook(Book book) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(book.getId()))
                list.set(i, book);
        }

    }

    @Override
    public List<Book> getBooks(String type) {
        List<Book>  list = new ArrayList<>();

        for (Book book: this.list) {
            if (book.getType().equals(type))
                list.add(book);
        }
        
        return list;
    }

    @Override
    public List<Book> getBooks() {
        return list;
    }
}
