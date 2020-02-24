package com.IDS.WebIDS.creta;

import com.IDS.WebIDS.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonCrete {

    int insertPerson(UUID id, Person person);

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
