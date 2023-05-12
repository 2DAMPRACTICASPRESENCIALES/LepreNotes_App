package com.example.leprenotesapp.domain;

import java.time.LocalDate;

public class Orders {

    private long id;
    private String code;
    private LocalDate orderDate;
    private boolean isCancelled = false;

    public Orders(long id, String code, LocalDate orderDate, boolean isCancelled) {
        this.id = id;
        this.code = code;
        this.orderDate = orderDate;
        this.isCancelled = isCancelled;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
