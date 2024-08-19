package com.ivoronline.controller;

import com.ivoronline.entity.Person;
import com.ivoronline.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // SELECT PERSON BY NAME AGE (Returns Single Entity)
  //================================================================
  @RequestMapping("SelectPersonByNameAge")
  Person selectPersonByNameAge() {
    Person john = personRepository.selectPersonByNameAge("John", 20);
    return john;
  }

}


