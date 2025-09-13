package com.deepika.SpringbootExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {
    //Persistence layer

    @Autowired
    TodoService todoService;



}
