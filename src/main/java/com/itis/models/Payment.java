package com.itis.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class Payment {
    @Id
    private long id;
    private long amount;
    @ManyToOne
    private Donator donator;
    @ManyToOne
    private Event event;
    private Date date;
}
