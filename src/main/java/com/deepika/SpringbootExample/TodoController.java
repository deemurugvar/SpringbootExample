package com.deepika.SpringbootExample;

import com.deepika.SpringbootExample.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    //creating a new record
    @PostMapping("/create")
    ResponseEntity<Todo> createTodoUser(@RequestBody Todo todo)
    {
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
