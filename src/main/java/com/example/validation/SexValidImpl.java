package com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SexValidImpl implements ConstraintValidator<SexValid, Sex> {


    @Override
    public boolean isValid(Sex value, ConstraintValidatorContext context) {
        return value != null;
    }
}
