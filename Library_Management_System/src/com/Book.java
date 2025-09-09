package com;

import java.io.Serializable;

public class Book implements Serializable {

	private String bookTitle;
	private String Author;
	private int bookId;
	private int bookCost;
	private int noOfPages;
	
	
	public Book() {
		
	}
	
	public Book(String bookTitle, String author, int bookId, int bookCost, int noOfPages) {
		
		this.bookTitle = bookTitle;
		Author = author;
		this.bookId = bookId;
		this.bookCost = bookCost;
		this.noOfPages = noOfPages;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public String getAuthor() {
		return Author;
	}
	public int getBookId() {
		return bookId;
	}
	
	public void display() {
		System.out.println("BookTitle: "+getBookTitle());
		System.out.println("Author: "+getAuthor());
		System.out.println("BookId: "+getBookId());
		System.out.println("Book Cost: "+getBookCost());
		System.out.println("noOfPages in Book: "+getNoOfPages());
		
		System.out.println("-------------------------------------------");
	}
	@Override
	public String toString() {
		
		return "\n BookTitle:"+bookTitle+"\n Author:"+Author+"\n BookId:"+bookId+
				"\n BookCost: "+bookCost+"\n noOfPages: "+noOfPages;
	}

	

}
