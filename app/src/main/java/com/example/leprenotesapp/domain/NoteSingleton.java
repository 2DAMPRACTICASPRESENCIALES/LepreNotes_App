package com.example.leprenotesapp.domain;

public class NoteSingleton {

    /** Clase usada para pasar datos entre Activities*/
    private static NoteSingleton instance = null;


    private long id;
    private String title;
    private String subject;
    private byte[] content;
    private String schoolYear;
    private int price;

    private NoteSingleton(){}

    public static NoteSingleton getInstance() {
        if (instance == null) {
            instance = new NoteSingleton();
        }
        return instance;
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

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
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
