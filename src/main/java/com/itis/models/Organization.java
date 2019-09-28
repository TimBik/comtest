package com.itis.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
@Data
public class Organization {
    @Id
    private long id;
    @OneToOne
    private User user;
    private String organizationName;
    private String bankAccount;


}
