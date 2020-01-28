package com.bryan.promopack.Resource.service;

import com.bryan.promopack.Resource.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book findById(Integer id);

}
