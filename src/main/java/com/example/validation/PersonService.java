package com.example.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Service
@Validated
public class PersonService {
    public List<String> register(@Valid Person person){
        return null;
    }
}
