package com.javalaunchpad.entity;

public class Age {
    private int  value = 0;
    private String unit = "years";

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
