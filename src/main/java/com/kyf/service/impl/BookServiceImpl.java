package com.kyf.service.impl;

import com.kyf.dao.BookDao;
import com.kyf.domain.Book;
import com.kyf.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public int create(Book book) {
        return this.bookDao.create(book);
    }

    @Override
    public Book findBookById(long bookId) {
        return this.bookDao.findBookById(bookId);
    }

    @Override
    public int update(Book book) {
        return this.bookDao.update(book);
    }

    @Override
    public int delete(long bookId) {
        return this.bookDao.delete(bookId);
    }
}
