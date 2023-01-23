package com.js.controller;


import java.util.ArrayList;

import com.js.dao.BookCRUD;
import com.js.dto.Book;


public class GetAllBooks {

	public static void main(String[] args) {
		BookCRUD bc=new BookCRUD();
		ArrayList<Book> sp=bc.getALlBooks();
        if(sp.size()>0) {
        	for(Book b:sp) {
        		System.out.println(b);
        		System.out.println();
        	}
        }else {
        	System.out.println("No books In Database");
        }
	}

}
