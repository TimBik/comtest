package com.itis.models;

import lombok.Data;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;


@Entity
@Data
public class Report {
    @Id
    private long id;
    @ManyToOne
    private Event event;
    private Date date;
    private String description;


}
