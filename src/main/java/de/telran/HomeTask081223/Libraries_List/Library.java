package de.telran.HomeTask081223.Libraries_List;

import de.telran.HomeTask081223.Libraries_List.Book;
import lombok.ToString;

import java.util.List;

@ToString
public class Library {
    private String address;
    private long bookNumbers;
    private List<Book> books;

    public Library(String address, long bookNumbers, List<Book> books) {
        this.address = address;
        this.bookNumbers = bookNumbers;
        this.books = books;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getBookNumbers() {
        return bookNumbers;
    }

    public void setBookNumbers(long bookNumbers) {
        this.bookNumbers = bookNumbers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
