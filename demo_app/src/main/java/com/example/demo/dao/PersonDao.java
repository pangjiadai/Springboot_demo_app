package com.example.demo.dao;

import com.example.demo.api.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    // insert a person
    int insertPerson(UUID id, Person person);
    // insert a person and generate random id
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    // delete
    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);

}
