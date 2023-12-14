package de.telran.HomeTask081223.Libraries_Array;

import lombok.*;


@ToString
public class Book {
    private String author;
    private String name;
    private int issueYear;
    private Condition condition;
    private boolean isEBOOK;

    public Book(String author, String name, int issueYear, Condition condition, boolean isEBOOK) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
        this.condition = condition;
        this.isEBOOK = isEBOOK;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public boolean isEBOOK() {
        return isEBOOK;
    }

    public void setEBOOK(boolean EBOOK) {
        isEBOOK = EBOOK;
    }
}