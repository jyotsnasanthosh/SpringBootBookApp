package com.springboot.service;

import java.util.List;

import com.springboot.model.Book;

public interface BookService {

	public void add(Book book);
	public void update(Book book);
	public void delete(String bookId);
	public Book findById(String bookId);
	public List<Book> findAll();
}
