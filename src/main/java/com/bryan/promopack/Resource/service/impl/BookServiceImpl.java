package com.bryan.promopack.Resource.service.impl;

import com.bryan.promopack.Resource.model.Book;
import com.bryan.promopack.Resource.repository.BookRepository;
import com.bryan.promopack.Resource.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    protected BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Integer id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.get();
    }
}
