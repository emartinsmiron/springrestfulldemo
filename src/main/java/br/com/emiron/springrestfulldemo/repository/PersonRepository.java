package br.com.emiron.springrestfulldemo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import br.com.emiron.springrestfulldemo.exception.NotFoundException;
import br.com.emiron.springrestfulldemo.model.Person;

@Component
public class PersonRepository{

     public static Map<String, Person> people = new HashMap<>();

     public void create(Person person){
          PersonRepository.people.put(person.getDocument(), person);
     }

     public Person searchByDocument(String document){
          document = null;
          document.length();
          return people.get(document);
     }

     public Collection<Person> list(){
          if (people.isEmpty()){
               throw new NotFoundException("Not Found");
          }
          return people.values();
     }

     public void update(Person person){
          people.put(person.getDocument(), person);

     }

     public void delete(Person person){
          people.remove(person.getDocument());

     }

}
