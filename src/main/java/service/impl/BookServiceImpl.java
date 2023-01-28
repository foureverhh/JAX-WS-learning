package service.impl;

import model.Book;
import service.BookService;

public class BookServiceImpl implements BookService {
    @Override
    public Book bookIsAvailable(Book book) {
        return book;
    }
}
