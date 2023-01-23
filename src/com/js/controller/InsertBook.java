package com.js.controller;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class InsertBook {

	public static void main(String[] args) {
         Book b=new Book();
         b.setBook_id(5);
         b.setBook_name("J2EE");
         b.setAuthor_name("Uday");
         b.setNo_of_pages(55);
         b.setPrice(8000.0);
         
         BookCRUD bc= new BookCRUD();
         int a=bc.insertBook(b);
         if(a>0) {
        	 System.out.println("Book is Inserted suffesfully");
         }else {
        	 System.out.println("Failed to insert");
         }
         
         
	}

}