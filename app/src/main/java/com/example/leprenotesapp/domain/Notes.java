package com.example.leprenotesapp.domain;

public class Notes {


    private long id;
    private String title;
    private String subject;
    private String content;
    private String schoolYear;
    private int price;

    public Notes(long id, String title, String subject, String content, String schoolYear, int price) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.content = content;
        this.schoolYear = schoolYear;
        this.price = price;
    }

    public Notes() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
