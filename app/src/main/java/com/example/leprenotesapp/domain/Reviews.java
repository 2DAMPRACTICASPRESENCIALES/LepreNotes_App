package com.example.leprenotesapp.domain;

import java.time.LocalDate;

public class Reviews {


    private long id;
    private String description;
    private LocalDate postDate;
    private int rating;
    private boolean isReported = false;

    public Reviews(long id, String description, LocalDate postDate, int rating, boolean isReported) {
        this.id = id;
        this.description = description;
        this.postDate = postDate;
        this.rating = rating;
        this.isReported = isReported;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPostDate() {
        return postDate;
    }

    public void setPostDate(LocalDate postDate) {
        this.postDate = postDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isReported() {
        return isReported;
    }

    public void setReported(boolean reported) {
        isReported = reported;
    }
}
