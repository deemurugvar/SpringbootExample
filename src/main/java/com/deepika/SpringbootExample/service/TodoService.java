package com.deepika.SpringbootExample.service;

import com.deepika.SpringbootExample.models.Todo;
import com.deepika.SpringbootExample.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Integer id)
    {
        return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    public List<Todo> getAllTodo()
    {
        //return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo not found"));
        return todoRepository.findAll();
    }

    public Todo updateTodo(Todo todo)
    {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Integer id)
    {
        todoRepository.deleteById(id);
    }
}
