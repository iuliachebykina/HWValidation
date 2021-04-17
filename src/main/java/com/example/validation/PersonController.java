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

    @GetMapping("/person/{birthday}/{name}/{lastName}/{sex}")
    public String getPerson(@PathVariable String birthday, @PathVariable String name, @PathVariable String lastName, @PathVariable String sex){
        String[] date = birthday.split("\\.");
        LocalDate b = LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
        var person = new Person(b, name, lastName, Sex.valueOf(sex));
        personService.register(person);
        return "success";
    }
}
