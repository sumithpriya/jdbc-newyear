package com.js.controller;

import com.js.dao.BookCRUD;

public class DeleteBookById {

	public static void main(String[] args) {
      BookCRUD bc=new BookCRUD();
      int result=bc.deleteBook(2);
      if(result>0) {
    	  System.out.println("Book is Deleted succesfully");
      }
      else {
    	  System.out.println("Failed to delete");
      }
      
	}

}
