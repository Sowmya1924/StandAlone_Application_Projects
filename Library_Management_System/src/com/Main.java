package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		Library l=new Library();
		
		boolean start=true;
		
		while(start) {
			
			System.out.println("1.AddBook \n2.ShowBookDetails \n3.SearchBook by bookId \n4.SearchBook by Author \n5.Update bookCost \n6.Remove Book by bookId \n7.Exit ");
			
			System.out.println("Enter your Choice: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1 : 
			  System.out.println("Enter BookTitle: ");
			  String bookTitle=sc.next();
			  System.out.println("Enter Author of Book: ");
			  String author=sc.next();
			  System.out.println("Enter Book Id: ");
			  int bookId=sc.nextInt();
			  System.out.println("Enter the cost of the book: ");
			  int bookCost=sc.nextInt();
			  System.out.println("Enter the number of pages in a book: ");
			  int noOfPages=sc.nextInt();
					  
			  l.addBook(new  Book(bookTitle,author,bookId,bookCost,noOfPages));
			 
					
			  break;
					  
					  
			case 2:
				l.showBook();
				break;
				    
			case 3:
				  System.out.println("Enter Book Id to Search the Book: ");
			      bookId=sc.nextInt();
				  l.searchBookById(bookId);
			      break;
			      
			case 4:
				System.out.println("Enter Author to search the book: ");
				author=sc.next();
				l.searchBookByAuthor(author);
				break;
			
			
			case 5:
				System.out.println("Enter the title of book to update the bookCost");
				bookTitle=sc.next();
				System.out.println("Enter the newCost ");
				bookCost=sc.nextInt();
				l.updateBookCost(bookTitle, bookCost);
				break;
				
				
			case 6:System.out.println("Enter bookId to remove the book: ");
			    bookId=sc.nextInt();
				l.removeBookById(bookId);
				break;
				
				
		    case 7:
		            System.out.println("Thank you for using the Library System. Exiting...");
		            start = false;
		            break;

		   default:
		            System.out.println("Invalid Input. Please enter a valid choice (1–7).");
					  
			
			}
		}

	}

}



