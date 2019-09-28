package com.itis.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BankAccount {
    @Id
    private long id;
    private String bankAccount;
    private Event event;

}
