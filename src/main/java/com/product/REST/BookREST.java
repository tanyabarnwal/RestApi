package com.product.REST;

import com.product.Details.Book_Details;
import com.product.Service.BookService;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookREST {

    @Autowired
    BookService bookService;

    public BookREST(BookService bookService)
    {
        this.bookService=bookService;
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Book_Details> getall(){
        return bookService.getall();
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    @ResponseBody
    public Optional<Book_Details> getById(@RequestParam("bookid")int bookid) {
        return bookService.getbyid(bookid);
    }

    @RequestMapping(value = "/addNewBook", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addnewbook(@RequestBody Book_Details book_details) {
        bookService.addBook(book_details);
        HttpHeaders ht=new HttpHeaders();
        ht.add("status", "200");
        ht.add("msg", "New Book added successfully");
        return new ResponseEntity<String>("status:200 New Book added successfully",ht,HttpStatus.OK);
    }

    @RequestMapping(value = "/deleteById/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<String> deletebookbyid(@PathVariable(value="id") int id)
    {
        bookService.deletebyid(id);
        return new ResponseEntity<String>("status:200 Book deleted successfully",HttpStatus.OK);
    }
}
