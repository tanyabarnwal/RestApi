package com.product.Service;

import com.product.Details.Book_Details;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {

    List<Book_Details> getall();
    Optional<Book_Details> getbyid(int bookid);
    public Book_Details addBook(Book_Details book_details);
    public void deletebyid(int id);

}
