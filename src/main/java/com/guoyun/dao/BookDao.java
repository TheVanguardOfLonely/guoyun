package com.guoyun.dao;

import com.guoyun.pojo.Book;

import java.util.List;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/7/22 22:56
 */
public interface BookDao {
    List<Book> getBookList(Book book);

    Book getBookById(Integer id);

    void updateBook(Book book);

    void addBook(Book book);

    void deleteBook(Integer id);

}
