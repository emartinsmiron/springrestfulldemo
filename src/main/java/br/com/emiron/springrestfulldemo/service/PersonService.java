package br.com.emiron.springrestfulldemo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.emiron.springrestfulldemo.model.Person;
import br.com.emiron.springrestfulldemo.repository.PersonRepository;

@Service
public class PersonService{

     @Autowired
     private PersonRepository personRepository;

     public void create(Person person){
          this.personRepository.create(person);
     }

     public Person searchByDocument(String document){
          return this.personRepository.searchByDocument(document);
     }

     public Collection<Person> list(){

          return this.personRepository.list();
     }

     public void delete(Person person){
          this.personRepository.delete(person);

     }

     public void update(Person person){
          this.personRepository.update(person);

     }
}
