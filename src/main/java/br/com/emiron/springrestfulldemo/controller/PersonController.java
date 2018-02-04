package br.com.emiron.springrestfulldemo.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.emiron.springrestfulldemo.model.Person;
import br.com.emiron.springrestfulldemo.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController{

     @Autowired
     private PersonService personService;

     @RequestMapping(path = "/create", method = RequestMethod.POST)
     public ResponseEntity<Void> create(@RequestBody Person person){
          this.personService.create(person);
          return new ResponseEntity<>(HttpStatus.CREATED);
     }

     @RequestMapping(path = "/{document}", method = RequestMethod.GET)
     public ResponseEntity<Person> search(@PathVariable("document") String document){
          Person returnedPerson = this.personService.searchByDocument(document);
          return new ResponseEntity<>(returnedPerson, HttpStatus.FOUND);
     }

     @RequestMapping(method = RequestMethod.GET)
     public ResponseEntity<Collection<Person>> list(){
          Collection<Person> list = this.personService.list();

          return new ResponseEntity<>(list, HttpStatus.FOUND);

     }

     @RequestMapping(path = "/delete", method = RequestMethod.DELETE)
     public ResponseEntity<Void> delete(@RequestBody Person person){
          this.personService.delete(person);
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     }

     @RequestMapping(path = "/update", method = RequestMethod.PUT)
     public ResponseEntity<Void> update(@RequestBody Person person){
          this.personService.update(person);
          return new ResponseEntity<>(HttpStatus.OK);
     }

}
