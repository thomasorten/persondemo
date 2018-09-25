package com.thomasorten.persondemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {

    private ArrayList<Person> personArrayList;

    PersonService() {
        personArrayList = new ArrayList<>();
        personArrayList.add(new Person("Ola", "Nordmann", 25));
        personArrayList.add(new Person("Ola2", "Nordmann", 25));
        personArrayList.add(new Person("Ola3", "Nordmann", 25));
        personArrayList.add(new Person("Ola4", "Nordmann", 25));
        personArrayList.add(new Person("Ola5", "Nordmann", 25));
        personArrayList.add(new Person("Ola6", "Nordmann", 25));
        personArrayList.add(new Person("Ola7", "Nordmann", 25));
        personArrayList.add(new Person("Ola8", "Nordmann", 25));
        personArrayList.add(new Person("Ola9", "Nordmann", 25));
        personArrayList.add(new Person("Ola10", "Nordmann", 25));
    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }
}
