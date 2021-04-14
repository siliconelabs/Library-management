package com.library.management.Util;


import com.library.management.DataAccessLayer.Book;
import org.springframework.stereotype.Component;

@Component
public class BookValidator {

    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle().equals(null))
            return false;
        return true;
    }
}
