package ru.miit.demo.repository.Repository;


import ru.miit.demo.repository.Models.DigitalBook;
import ru.miit.demo.repository.Storage.IStorage;

import java.util.List;

public class DigitalBookRepository extends AbstractRepository implements ITypedBookRepository<DigitalBook>{
    public DigitalBookRepository(IStorage storage) {
        super(storage);
    }


    @Override
    public void addBook(DigitalBook digitalBook) {
        storage.addBook(digitalBook);
    }

    @Override
    public void deleteBook(DigitalBook digitalBook) {
        storage.deleteBook(digitalBook);
    }

    @Override
    public void updateBook(DigitalBook digitalBook) {
        storage.updateBook(digitalBook);
    }

    @Override
    public List<DigitalBook> getBooks(String type) {
        return storage.getBooks(type);
    }
}
