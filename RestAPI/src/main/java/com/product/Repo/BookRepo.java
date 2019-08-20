package com.product.Repo;


import com.product.Details.Book_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book_Details,Integer> {



}
