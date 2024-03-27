package com.javalaunchpad.formatter;

import com.javalaunchpad.entity.Salary;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class SalaryFormatter implements Formatter<Salary> {

    @Override
    public Salary parse(String text, Locale locale) throws ParseException {
        String[] parts = text.split(" ");
        Salary salary = new Salary();
        salary.setCurrency(parts[0]);
        salary.setAmount(Double.parseDouble(parts[1]));
        return salary;
    }

    @Override
    public String print(Salary object, Locale locale) {
        return object.getCurrency() + " " + object.getAmount();
    }
}
