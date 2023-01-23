package com.js.controller;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

public class GetBookById {

	public static void main(String[] args) {
		BookCRUD bc=new BookCRUD();
		Book b=bc.getBookById(1);
		if(b!=null) {
			System.out.println(b);
		}else {
			System.out.println("No Book with Given ID");
		}
		
	}

}
