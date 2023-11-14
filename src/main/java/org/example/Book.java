package org.example;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters and setters
    // ...
    public void setId(String id){
        this.id = id;
    } 
    public void setTitle(String title){
        this.title = title;
    } 
    public void setAuthor(String author){
        this.author = author;
    } 
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    } 
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
   
    // Additional methods
    public void markAsUnavailable() {
        this.isAvailable = false;
    }

    public void markAsAvailable() {
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
