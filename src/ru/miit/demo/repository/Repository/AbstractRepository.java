package ru.miit.demo.repository.Repository;

import ru.miit.demo.repository.Storage.IStorage;

public abstract class AbstractRepository {
    IStorage storage;

    public AbstractRepository(IStorage storage) {
        this.storage = storage;
    }
}
