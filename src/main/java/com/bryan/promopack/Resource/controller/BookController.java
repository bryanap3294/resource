package com.bryan.promopack.Resource.controller;

import com.bryan.promopack.Resource.model.Book;
import com.bryan.promopack.Resource.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){
        return ResponseEntity.ok().body(bookService.findAll());
    }

    @GetMapping
    public ResponseEntity<Book> findById(@RequestParam(name="id") Integer id){
        return ResponseEntity.ok().body(bookService.findById(id));
    }

}
