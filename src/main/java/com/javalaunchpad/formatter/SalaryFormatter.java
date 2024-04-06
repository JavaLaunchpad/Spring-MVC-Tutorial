package com.javalaunchpad.formatter;

import com.javalaunchpad.entity.Salary;
import org.springframework.format.Formatter;
import org.springframework.format.number.NumberStyleFormatter;

import java.text.ParseException;
import java.util.Locale;

public class SalaryFormatter implements Formatter<Salary> {

    @Override
    public Salary parse(String text, Locale locale) throws ParseException {
        String ammount =  text.substring(0 ,text.indexOf(' '));
        String currency = text.substring(text.indexOf(' ') + 1);
        Salary salary = new Salary();
        salary.setCurrency(currency);
        salary.setAmount(Double.parseDouble(ammount));
        return salary;
    }

    @Override
    public String print(Salary object, Locale locale) {
        System.out.println("object = " + object);
        return object.getCurrency() + " " + object.getAmount();
    }
}
