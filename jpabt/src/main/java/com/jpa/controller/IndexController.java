package com.jpa.controller;

import com.jpa.repository.AuthorRepository;
import com.jpa.repository.PoetryRepository;
import com.jpa.repository.ReaderRepository;
import com.jpa.repository.WifeRepository;
import com.jpa.vo.Author;
import com.jpa.vo.Poetry;
import com.jpa.vo.Reader;
import com.jpa.vo.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class IndexController {

    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    PoetryRepository poetryRepository;
    @Autowired
    WifeRepository wifeRepository;

    @Autowired
    ReaderRepository readerRepository;

    @GetMapping("/author/{id}")
    public Author findAuthorById(@PathVariable(value = "id") Integer id) {
        Author author = authorRepository.findById(id).get();
        return authorRepository.findById(id).get();
    }

    @GetMapping("/wife/{id}")
    public Wife findWifeById(@PathVariable(value = "id") Integer id) {
        return wifeRepository.findById(id).get();
    }

    @GetMapping("/poetry/{id}")
    public Poetry findPoetryById(@PathVariable(value = "id") Integer id) {
        return poetryRepository.findById(id).get();
    }

    @GetMapping("/reader/{id}")
    public Reader findReaderById(@PathVariable(value = "id") Integer id) {
        return readerRepository.findById(id).get();
    }
}
