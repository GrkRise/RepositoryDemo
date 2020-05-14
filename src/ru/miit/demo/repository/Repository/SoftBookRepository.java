package ru.miit.demo.repository.Repository;

import ru.miit.demo.repository.Models.DigitalBook;
import ru.miit.demo.repository.Models.SoftBook;
import ru.miit.demo.repository.Storage.IStorage;

import java.util.List;

public class SoftBookRepository extends AbstractRepository implements ITypedBookRepository<SoftBook> {
    public SoftBookRepository(IStorage storage) {
        super(storage);
    }

    @Override
    public void addBook(SoftBook softBook) {
        storage.addBook(softBook);
    }

    @Override
    public void deleteBook(SoftBook softBook) {
        storage.deleteBook(softBook);
    }

    @Override
    public void updateBook(SoftBook softBook) {
        storage.updateBook(softBook);
    }

    @Override
    public List<DigitalBook> getBooks(String type) {
        return storage.getBooks(type);
    }


}
