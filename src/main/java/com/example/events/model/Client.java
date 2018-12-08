package com.example.events.model;

import javax.persistence.Entity;
import javax.persistence.Id;


import java.util.UUID;
@Entity
public class Client {
    @Id
    private UUID userId;
    private String firstName;
    private String secondName;
    private String email;

    public UUID getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(UUID userId, String firstName, String secondName, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
    }

    public static class ClientBuilder{

        private Client client;

        public ClientBuilder(Client client){ this.client = client;}

        public ClientBuilder setId(UUID id){
            this.client.userId = id;
            return this;
        }

        public ClientBuilder setFirstName(String name){
            this.client.firstName = name;
            return this;
        }

        public ClientBuilder setSecondName(String name){
            this.client.secondName = name;
            return this;
        }

        public ClientBuilder setEmail(String email){
            this.client.email = email;
            return this;
        }

        public Client build(){return this.client;}
    }
}
