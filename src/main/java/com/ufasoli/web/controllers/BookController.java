package com.ufasoli.web.controllers;

import com.ufasoli.core.model.Book;
import com.ufasoli.core.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: ufasoli
 * Date: 21/06/13
 * Time: 19:29
 * Project : spring-mongodb
 */
@Controller
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, value = "/book")
public class BookController {


    @Autowired
    private BookRepository bookRepository;


    public @ResponseBody
    List<Book> books(){
        return new ArrayList<Book>((Collection<? extends Book>) bookRepository.findAll());
    }


}
