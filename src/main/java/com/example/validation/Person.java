package com.example.validation;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@RequiredArgsConstructor

public class Person {
    @BirthdayValid
    LocalDate birthday; // дата рождения
    @NotBlank
    @Size(max = 125, message = "{name-valid}")
    String name; // имя
    @Size(max = 150, message = "{last-name-valid}")
    String lastName; // фамилия
    @SexValid
    Sex sex; // пол

    public Person(LocalDate birthday, String name, String lastName, Sex sex) {
        this.birthday = birthday;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }
}

enum Sex {
    MALE,
    FEMALE
}