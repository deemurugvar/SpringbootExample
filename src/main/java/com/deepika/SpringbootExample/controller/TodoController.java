package com.deepika.SpringbootExample.controller;

import com.deepika.SpringbootExample.service.TodoService;
import com.deepika.SpringbootExample.models.Todo;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
@Slf4j
public class TodoController {

    private static final Logger log = LoggerFactory.getLogger(TodoController.class);
    @Autowired
    private TodoService todoService;

    //creating a new record
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Todo list created successfully"),
            @ApiResponse(responseCode = "500", description = "Todo DB not available")

    })
    @PostMapping("/create")
    ResponseEntity<Todo> createTodoUser(@RequestBody Todo todo)
    {
        log.info("Creation of record");
        return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED) ;
    }

    //retrieving the record by providing id
    @GetMapping("/get/{id}")
    ResponseEntity<Todo> getTodoListById(@PathVariable Integer id)
    {
        try{
            return new ResponseEntity<>(todoService.getTodoById(id), HttpStatus.OK) ;
        } catch (RuntimeException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND) ;
        }
    }

    //retrieving all the records
    @GetMapping("/getAll")
    ResponseEntity<List<Todo>> getAllTodoList()
    {
        return new ResponseEntity<List<Todo>>(todoService.getAllTodo(), HttpStatus.OK) ;
    }

    //Updating the record
    @PutMapping("/update")
    ResponseEntity<Todo> updateTodoList(@RequestBody Todo body)
    {
        return new ResponseEntity<Todo>(todoService.updateTodo(body), HttpStatus.OK) ;
    }

    //delete the record by id
    @DeleteMapping("/delete/{id}")
    void deleteTodoListById(@PathVariable Integer id)
    {
        todoService.deleteTodoById(id);
    }
 }
