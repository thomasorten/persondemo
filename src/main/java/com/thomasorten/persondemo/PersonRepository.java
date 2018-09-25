package com.thomasorten.persondemo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {
    public List<Person> findAll();
    public Person save(Person person);
    public List<Person> findByFirstName(String firstName);
}