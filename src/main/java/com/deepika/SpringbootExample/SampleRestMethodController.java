package com.deepika.SpringbootExample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class SampleRestMethodController {

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
    @GetMapping("//")
    String displayIdWithQueryParam(@RequestParam int id)
    {
        return "Visitor No: " + id;
    }

    //Request Param with different param name in the url http://localhost:8080/hello/query?primaryid=122345
    @GetMapping("/query")
    String displayIdWithQueryParamByDifferentName(@RequestParam("primaryid") int id)
    {
        return "Visitor No: " + id;
    }


    @PostMapping("/create")
    String displayIdCreated(@RequestBody String body)
    {
        return body;
    }


    @PutMapping("/update/{id}")
    String displayIdUpdated(@PathVariable int id)
    {
        return "Updated Visitor No: " + id;
    }

    @DeleteMapping("/delete/{id}")
    String displayIdDeleted(@PathVariable int id)
    {
        return "Deleted Visitor No: " + id;
    }

}
