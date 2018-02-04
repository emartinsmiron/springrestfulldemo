package br.com.emiron.springrestfulldemo.model;

import java.time.LocalDate;

public class Person{

     private String document;
     private String name;
     private String surname;
     private LocalDate birthDate;

     public String getDocument(){
          return this.document;
     }

     public void setDocument(String document){
          this.document = document;
     }

     public String getName(){
          return this.name;
     }

     public void setName(String name){
          this.name = name;
     }

     public String getSurname(){
          return this.surname;
     }

     public void setSurname(String surname){
          this.surname = surname;
     }

     public LocalDate getBirthDate(){
          return this.birthDate;
     }

     public void setBirthDate(LocalDate birthDate){
          this.birthDate = birthDate;
     }

}
