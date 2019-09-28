package com.itis.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class News {
    @Id
    private long id;
    private String name;
    private String description;
    private Date date;
    @ManyToOne
    private Event event;

}
