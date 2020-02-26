package com.IDS.WebIDS.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private final UUID id;
    @NotBlank
    private final String name;
    private final String surname;
    private final String residence;
    private final String email;
    private final String password;

    public Person(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("surname") String surname,
                  @JsonProperty("residence") String residence,
                  @JsonProperty("email") String email,
                  @JsonProperty("password") String password){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.residence = residence;
        this.email = email;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getResidence() {
        return residence;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}