package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="bookid")
	private String bookId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private float price;
	
	@Column(name="publisher")
	private String publisher;
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", price=" + price + ", publisher=" + publisher + "]";
	}
}
