package com.deepika.SpringbootExample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {

    /* The below method will print hello world if http://localhost:8080/hello/ is hit in the browser
    This class is a sample controller class with different http methods*/

    @GetMapping("/")
    String displayHello()
    {
        return "Hello World!!";
    }
    //PathVariable
    @GetMapping("/{id}")
    String displayId(@PathVariable int id)
    {
        return "Visitor No: " + id;
    }
    //Request Param http://localhost:8080/hello//?id=122345

}
