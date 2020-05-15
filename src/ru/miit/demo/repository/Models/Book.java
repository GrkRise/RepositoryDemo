package ru.miit.demo.repository.Models;


public abstract class Book {
    Long id;
    String title;
    String type;
    int pages;

    public Book(Long id, String title, String type, int pages) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.pages = pages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", pages=" + pages +
                "}\n";
    }
}
