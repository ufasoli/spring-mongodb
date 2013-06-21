package com.ufasoli.core.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * User: ufasoli
 * Date: 18/06/13
 * Time: 18:48
 * Project : spring-mongodb
 */
@Document(collection = "BOOK")
public class Book implements Serializable{

    @Id
    protected String id;

    protected String title;

    @Indexed(sparse = true)
    protected Integer publicationYear;

    protected Boolean series;

    protected Integer nbPages;

    protected List<Book> books;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Boolean getSeries() {
        return series;
    }

    public void setSeries(Boolean series) {
        this.series = series;
    }

    public Integer getNbPages() {
        return nbPages;
    }

    public void setNbPages(Integer nbPages) {
        this.nbPages = nbPages;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
