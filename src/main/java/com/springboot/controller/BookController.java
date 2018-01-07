package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Book;
import com.springboot.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value="/books/add", method=RequestMethod.POST)
	public void add(@RequestBody Book book) {
		bookService.add(book);
	}
	
	@RequestMapping(value="/books/get", method=RequestMethod.GET)
	public Book findById(@RequestParam("id") String bookId) {
		return bookService.findById(bookId);
	}
	
	@RequestMapping(value="/books/getAll", method=RequestMethod.GET)
	public List<Book> findById() {
		return bookService.findAll();
	}
	
	@RequestMapping(value="/books/update", method=RequestMethod.POST)
	public void update(@RequestBody Book book) {
		bookService.update(book);
	}
	
	@RequestMapping(value="/books/delete", method=RequestMethod.GET)
	public void delete(@RequestParam("id") String bookId) {
		bookService.delete(bookId);
	}
}
