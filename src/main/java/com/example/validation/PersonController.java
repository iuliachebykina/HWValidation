package com.example.validation;


import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@RestController
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class PersonController {

    PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }


    @PostMapping("/person")
    public String getPerson(@RequestBody PersonJson json){
        String[] date = json.getBirthday().split("\\.");
        LocalDate birthday = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
        var person=  new Person(birthday, json.getName(), json.getLastName(), Sex.valueOf(json.getSex()));
        personService.register(person);
        return "success";
    }
}
