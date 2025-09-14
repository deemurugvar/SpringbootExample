package com.deepika.SpringbootExample.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Data
public class Todo {

    @Id
    @GeneratedValue
    @NotNull
    Integer id;
    String title;
    String description;
    Boolean isCompleted;

}
