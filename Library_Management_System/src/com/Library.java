package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	
	private Book b;
	private ArrayList<Book> book=new ArrayList<Book>();
	
	public void addBook(Book b) {
		book.add(b);
		System.out.println("Book is Added...");
	}
	
	public void showBook() {
		
		if(book.isEmpty())
			System.out.println("Book is not Added yet...");
		else {
			
			for(Book b:book) {
				b.display();
			}
			
		}
		
	}
	
	public void searchBookById(int bookId) {
		
		boolean idFound=false;
		if(book.isEmpty())
			System.out.println("Book is not Added yet...");
		
		else {
			
			for(Book b:book) {
				
				if(b.getBookId()==bookId) {
					System.out.println("BookId of the "+b.getBookTitle()+"is: "+b.getBookId());
					idFound=true;
				}
			}
		}
		if(!idFound) {
//			System.out.println("Invalid BookId.....Book is not Found........");
			
			throw new InvalidIdException();
		}
	
	}
	public void searchBookByAuthor(String Author) {
		
		boolean authorFound=false;
		if(book.isEmpty())
			System.out.println("Book is not Added yet...");
		else {
			
			for (Book b : book) {
				
				if(b.getAuthor().equalsIgnoreCase(Author)) {
					System.out.println(b.getBookTitle()+" is Written by : "+b.getAuthor());
					authorFound=true;
				}
				
			}
		}
		if(!authorFound) {
//			System.out.println("Invalid Author.....Book is not Found...");
			throw new AuthorNameMismatchException();
		}
		
	}
	
	public void updateBookCost(String title,int newCost) {
		
		boolean isUpdated=false;
		Iterator<Book> itr=book.iterator();
		
		if(book.isEmpty())
			System.out.println("Book is not Added yet...");
		
		else {
			
		   for(Book b:book) {
			   
			   if(b.getBookTitle().equalsIgnoreCase(title)) {
				   
				   b.setBookCost(newCost);
				   isUpdated=true;	
				   
			   }   
			   
		   }
		}
	
		if(!isUpdated) {
//			System.out.println("Cost is not updated...bcoz Book is not Found......... ");
			throw new BookTitleMismatchException();
		}
	}
	
	public void removeBookById(int bookId) {
		
		Iterator<Book> itr=book.iterator();
		if(book.isEmpty())
			System.out.println("Book is not Added yet...");
		
			
	     while(itr.hasNext()) {
				
				Book b=itr.next();
				if(b.getBookId()==bookId) {
					
					itr.remove();
//		            System.out.println("Book with ID " + bookId + " is removed.");
					throw new NoSuchBooksException();
				}
		}
		
	}
	

}
