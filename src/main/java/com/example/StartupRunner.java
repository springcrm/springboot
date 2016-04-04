package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.example.entity.Book;
import com.example.repository.BookRepository;

public class StartupRunner implements CommandLineRunner {
    protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);
    @Autowired
    private BookRepository bookRepository;
    @Override
    public void run(String... strings) throws Exception {
        logger.info("hello");
        Book book = new Book(null, "a", "a", "a");
        bookRepository.save(book);
        logger.info("count"+bookRepository.count());
    }
}