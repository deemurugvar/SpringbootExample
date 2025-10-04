package com.deepika.SpringbootExample.repository;

import com.deepika.SpringbootExample.models.Todo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    //Persistence layer





}
