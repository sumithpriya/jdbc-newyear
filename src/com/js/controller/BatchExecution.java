package com.js.controller;

import java.util.ArrayList;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class BatchExecution {

	public static void main(String[] args) 
	{
       ArrayList<Book> books=new ArrayList<>();
       Book b1=new Book();
       b1.setBook_id(30);
       b1.setBook_name("J2EE");
       b1.setAuthor_name("Uday");
       b1.setNo_of_pages(55);
       b1.setPrice(8000.0);
       
       Book b2=new Book();
       b2.setBook_id(31);
       b2.setBook_name("JAVA");
       b2.setAuthor_name("ABHILASH");
       b2.setNo_of_pages(70);
       b2.setPrice(9000.0);
       
       Book b3=new Book();
       b3.setBook_id(32);
       b3.setBook_name("SQL");
       b3.setAuthor_name("AFNAN");
       b3.setNo_of_pages(35);
       b3.setPrice(5000.0);
       
       Book b4=new Book();
       b4.setBook_id(33);
       b4.setBook_name("WEB");
       b4.setAuthor_name("SHILPA");
       b4.setNo_of_pages(40);
       b4.setPrice(6000.0);
       
       books.add(b1);
       books.add(b2);
       books.add(b3);
       books.add(b4);
       
       BookCRUD bc=new BookCRUD();
       boolean bo=bc.batchExecution(books);
    		   if(bo) {
    			   System.out.println("Done");
    		   }else {
    			   System.out.println("Not Done");
    		   }
	}
	
	

} 
