package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class BirthdayValidImpl implements ConstraintValidator<BirthdayValid, LocalDate> {
    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        LocalDate localDate = LocalDate.now();
        int valueYear =value.getYear();
        int nowYear = localDate.getYear();
        int valueMonth = value.getMonth().getValue();
        int nowMonth =  localDate.getMonth().getValue();
        int valueDay = value.getDayOfMonth();
        int nowDay =localDate.getDayOfMonth();
        if (value == null) {
            return false;
        }
        if (valueYear > nowYear) {
            return false;
        }
        if (valueYear == localDate.getYear()) {
            if (valueMonth > nowMonth) {
                return false;
            }
            if (valueDay >= nowDay) {
                return false;
            }
        }
        return valueYear > nowYear - 100;
    }
}

