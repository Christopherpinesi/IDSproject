package com.IDS.WebIDS.service;

import com.IDS.WebIDS.creta.PersonCrete;
import com.IDS.WebIDS.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonCrete personCrete;

    @Autowired
    public PersonService(@Qualifier("postgres") PersonCrete personCrete) {
        this.personCrete = personCrete;
    }

    public int addPerson(Person person){
        return personCrete.insertPerson(UUID.randomUUID(),person);
    }
    public List<Person> getAllPeople() {
        return personCrete.selectAllPeople();
    }
    public Optional<Person> getPersonById(UUID id) {
        return personCrete.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personCrete.deletePersonById(id);
    }
    public int updatePerson(UUID id, Person newPerson ){
        return personCrete.updatePersonById(id, newPerson);
    }
}