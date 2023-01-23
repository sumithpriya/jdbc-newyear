package com.js.controller;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class UpdateBookById {

	public static void main(String[] args) {
    Book b=new Book();
    b.setBook_name("SQL");
    b.setAuthor_name("Afnan");
    b.setNo_of_pages(100);
    b.setPrice(4000.00);
    
    BookCRUD bc=new BookCRUD();
    int result=bc.updateBook(3, b);
    if(result>0) {
    	System.out.println("Book is updated sucessfully");
    }else {
    	System.out.println("Failed to update");
    }
    
    
    

	}

}
