package com.thomasorten.persondemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersondemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    PersonRepository personRepository;

    @Test
    public void testPersonSave() {
        Person person = new Person("Ola", "Nordmann", 35);
        Person returPerson = personRepository.save(person);
        Assert.assertEquals(person.getLastName(), returPerson.getLastName());
    }

}
