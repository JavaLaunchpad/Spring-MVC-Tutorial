package com.javalaunchpad.entity;

public class Salary {
    private String currency = "USD";
    private Double amount = 1000.0;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
