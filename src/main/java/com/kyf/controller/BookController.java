package com.kyf.controller;

import com.kyf.domain.Book;
import com.kyf.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @RequestMapping("/findBookById/{bookId}")
    @ResponseBody
    public Book findBookById(@PathVariable("bookId") long bookId) {
        return this.bookService.findBookById(bookId);
    }
    @RequestMapping("/create")
    @ResponseBody
    public long create(@RequestBody Book book) {
        book.setCreateTime(System.currentTimeMillis());
        return this.bookService.create(book);
    }

    @RequestMapping("/update")
    @ResponseBody
    public long update(@RequestBody Book book) {
        book.setUpdateTime(System.currentTimeMillis());
        return this.bookService.update(book);
    }

    @RequestMapping("/delete/{bookId}")
    @ResponseBody
    public long update(@PathVariable("bookId") long bookId) {
        return this.bookService.delete(bookId);
    }

}
