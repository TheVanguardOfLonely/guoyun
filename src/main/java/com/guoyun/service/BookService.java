package com.guoyun.service;

import com.github.pagehelper.PageInfo;
import com.guoyun.pojo.Book;
import org.springframework.stereotype.Service;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/12/7 21:17
 */
@Service
public interface BookService {
    PageInfo<Book> getBookList(Book book, int pageNum, int pageSize);

    Book getBookById(Integer id);

    void updateBook(Book book);

    void addBook(Book book);

    void deleteBook(Integer id);
}
