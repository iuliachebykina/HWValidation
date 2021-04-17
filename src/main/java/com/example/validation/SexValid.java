package com.example.validation;

import com.example.validation.SexValidImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = SexValidImpl.class)
public @interface SexValid {
    String message() default "{sex-valid}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
