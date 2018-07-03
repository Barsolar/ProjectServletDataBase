package pwr.entity;

public class Book {

    private int idbooks;
    private String title;
    private String author;
    private String isbn;
    private String url;
    private int year;

    public Book(int idbooks, String title, String author, String isbn, int year) {
        this.idbooks = idbooks;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public Book() {}

    public int getIdbooks() {
        return idbooks;
    }

    public void setIdbooks(int idbooks) {
        this.idbooks = idbooks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String url) {
        this.url = url;
    }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString()
    {
        String str = "ID: " + idbooks + " Title: " + title + " Author: " + author + " Year: " + year + " ISBN: " + isbn;
        return str;
    }
}
