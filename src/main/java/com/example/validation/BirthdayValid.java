package com.example.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = BirthdayValidImpl.class)
public @interface BirthdayValid {
    String message() default "{birthday-valid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
