package com.product.Service;

import com.product.Details.Book_Details;

import com.product.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepo bookRepo;

    public BookServiceImp(BookRepo bookRepo){
        this.bookRepo=bookRepo;
    }

    @Override
    public List<Book_Details> getall(){
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book_Details> getbyid(int bookid){

        //List<Book_Details> view=bookRepo.findById(bookid);
        //int id=view.get(0).getCardGroupSetId();
        //System.out.println(id);
        //return	repocardgroupdetails.findById(id);

        return bookRepo.findById(bookid);
    }

    @Override
    public Book_Details addBook(Book_Details book_details){
        return bookRepo.save(book_details);
    }

    @Override
    public void deletebyid(int id){
        bookRepo.deleteById(id);
    }

}
