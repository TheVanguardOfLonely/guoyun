package com.guoyun.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoyun.dao.BookDao;
import com.guoyun.pojo.Book;
import com.guoyun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/12/7 21:19
 */
@Service("bookService")
public class BookImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public PageInfo<Book> getBookList(Book book, int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize,"id desc");
        List<Book> list = bookDao.getBookList(book);
        PageInfo<Book> pageInfo = new PageInfo<Book>(list);
        return pageInfo;
    }

    @Override
    public Book getBookById(Integer id){
        return bookDao.getBookById(id);
    }

    @Override
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    @Override
    public void addBook(Book book){
        bookDao.addBook(book);
    }

    @Override
    public void deleteBook(Integer id){
        bookDao.deleteBook(id);
    }
}
