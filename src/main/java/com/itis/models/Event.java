package com.itis.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "event")
public class Event {
    @Id
    private long id;

    private String name;
    private long target;
    private long currentMoney;
    private String description;
    private Date publication;
    private Date deadLine;
    @ManyToOne
    private Organization organization;
    private String district;


}
