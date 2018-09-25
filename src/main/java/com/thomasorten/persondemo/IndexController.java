package com.thomasorten.persondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    PersonService personService;

    @Autowired
    PersonRepository personRepository;

    String firstName;

    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("persons", personService.getPersonArrayList());
        return "index";
    }

    @RequestMapping(path = "/persons/json", method = RequestMethod.GET)
    public @ResponseBody List<Person> getJson(){
        return personRepository.findAll();
        //return personService.getPersonArrayList();
    }

    @RequestMapping(path = "/persons/json", method = RequestMethod.POST)
    public @ResponseBody Person savePerson(
            @RequestParam(value= "firstName", required = false) String firstName){
        this.firstName = firstName;
        return null;
    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public @ResponseBody Person deletePerson(
            @RequestParam(value= "id", required = false) String id){
        personRepository.deleteById(id);
        return null;
    }

}
