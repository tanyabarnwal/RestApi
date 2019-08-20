package com.product.Details;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "BOOK_DETAILS")

public class Book_Details {

    @Id
    @Column(name = "BOOK_ID", nullable = false, length = 11)
    int bookid;
    //@GeneratedValue(strategy= GenerationType.AUTO)



    @Column(name = "UNINO", nullable = false,length = 50)
    int unino;

    @Column(name = "TITLE", nullable = false,length = 50)
    String title;

    @Column(name = "AUTHOR", nullable = false,length = 50)
    String author;

    @Column(name = "PUBLICATION", nullable = false,length = 50)
    String publication;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getUnino() {
        return unino;
    }

    public void setUnino(int unino) {
        this.unino = unino;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
