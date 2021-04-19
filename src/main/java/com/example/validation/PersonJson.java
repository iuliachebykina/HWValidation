package com.example.validation;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
public class PersonJson {
    String birthday;
    String name;
    String lastName;
    String sex;

    public PersonJson(String birthday, String name, String lastName, String sex) {
        this.birthday = birthday;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }
}
