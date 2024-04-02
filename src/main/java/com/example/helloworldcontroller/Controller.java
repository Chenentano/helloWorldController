package com.example.helloworldcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;

@RestController
public class Controller {

    @GetMapping("api/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hallo " + name;
    }

}
