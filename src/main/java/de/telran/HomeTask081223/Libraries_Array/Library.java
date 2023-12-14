package de.telran.HomeTask081223.Libraries_Array;

import lombok.*;

@ToString
public class Library {
    private String address;
    private long bookNumbers;
    private Book[] books;

    public Library(String address, long bookNumbers, Book[] books) {
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

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
