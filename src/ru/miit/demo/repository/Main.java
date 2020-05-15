package ru.miit.demo.repository;

import ru.miit.demo.repository.Models.Book;
import ru.miit.demo.repository.Models.DigitalBook;
import ru.miit.demo.repository.Models.SoftBook;
import ru.miit.demo.repository.Repository.BookRepository;
import ru.miit.demo.repository.Repository.DigitalBookRepository;
import ru.miit.demo.repository.Repository.SoftBookRepository;
import ru.miit.demo.repository.Storage.ArrayStorage;



public class Main {

    public static void main(String[] args) {
        	// write your code here
        SoftBook softBook = new SoftBook(1L, "The Hobbit", 800);
        DigitalBook digitalBook = new DigitalBook(2L, "The Lord of the Rings: Fellowship of the Ring", 750);
        DigitalBook digitalBook1 = new DigitalBook(3L, "The Lord of the Rings: The Two Towers", 780);
        DigitalBook digitalBook2 = new DigitalBook(4L, "The Lord of the Rings: The return of the king", 800);

        ArrayStorage storage = new ArrayStorage();


        BookRepository bookRepository = new BookRepository(storage);
        DigitalBookRepository digitalBookRepository = new DigitalBookRepository(storage);
        SoftBookRepository softBookRepository = new SoftBookRepository(storage);

        storage.addBook(softBook);
        storage.addBook(digitalBook);
        storage.addBook(digitalBook1);
        storage.addBook(digitalBook2);

        System.out.println(softBookRepository.getBooks("soft"));
//        System.out.println(digitalBookRepository.getBooks("digital"));
//        System.out.println(bookRepository.getBooks());


    }
}
