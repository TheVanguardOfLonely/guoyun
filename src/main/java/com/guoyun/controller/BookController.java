package com.guoyun.controller;

import com.guoyun.pojo.ResultInfo;
import com.github.pagehelper.PageInfo;
import com.guoyun.pojo.Book;
import com.guoyun.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GY
 * @site
 * @company
 * @create 2019/7/21 22:18
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("book_list.json")
    @ResponseBody
    public Map<String,Object> bookList(Book book, Integer page, Integer rows){
        PageInfo<Book> pageInfo = bookService.getBookList(book,page,rows);
        Map<String,Object> result = new HashMap<String, Object>();
        result.put("total",pageInfo.getTotal());//一共多少条
        result.put("rows",pageInfo.getList());
        return result;
    }

    @RequestMapping("book_detail.json")
    public ModelAndView getBookById(Integer id){
        Book book = bookService.getBookById(id);
        return new ModelAndView("/jsp/detail.jsp","book",book);
    }

    @RequestMapping("update_book.json")
    @ResponseBody
    public ResultInfo updateBook(Book book){
        bookService.updateBook(book);
        return new ResultInfo(true,"编辑成功");
    }

    @RequestMapping("edit_book.json")
    @ResponseBody
    public ResultInfo editBook(Book book){
        ResultInfo resultInfo = new ResultInfo();
        if(book.getId() == null){
            bookService.addBook(book);
        }else{
            bookService.updateBook(book);
        }
        resultInfo.setStatus(true);
        resultInfo.setMessage("编辑成功");
        return resultInfo;
    }

    @RequestMapping("delete_book.json")
    @ResponseBody
    public ResultInfo deleteBook(int id) {
        ResultInfo resultInfo = new ResultInfo();
        try {
            bookService.deleteBook(id);
            resultInfo.setStatus(true);
            resultInfo.setMessage("删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo.setStatus(false);
            resultInfo.setMessage("删除失败");
        }
        return resultInfo;
    }

}
