package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class book {
    @Id
    private String isbn;
    private String author;
    private String title;
    private int comments =0;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {

        this.comments = comments;
    }

    @Override
    public String toString() {
        return "book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}


