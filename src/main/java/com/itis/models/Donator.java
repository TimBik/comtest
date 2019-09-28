package com.itis.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Data
public class Donator {
    @Id
    private long id;
    @OneToOne
    private User user;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String phoneNumber;
    private char gender;
}
