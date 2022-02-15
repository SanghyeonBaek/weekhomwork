package com.sparta.week01.controller;

import com.sparta.week01.work1.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getpersoncon(){
        Person person = new Person();
        person.setName("백상현");
        person.setAge(28);
        person.setTel("010-1234-1234");
        return person;
    }
}
