package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.BookRepository;
import com.springboot.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void add(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void update(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void delete(String bookId) {
		bookRepository.delete(bookId);
	}

	@Override
	public Book findById(String bookId) {
		return bookRepository.findOne(bookId);
	}

	@Override
	public List<Book> findAll() {
		List<Book> bookList = new ArrayList<Book>();
		bookRepository.findAll().forEach(bookList::add);
		return bookList;
	}

}
