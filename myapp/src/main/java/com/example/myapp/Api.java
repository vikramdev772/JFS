package com.example.myapp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(
    origins = "*",
    methods = {
        RequestMethod.GET,
        RequestMethod.POST,
        RequestMethod.PUT,
        RequestMethod.DELETE
    }
)
@RestController
public class Api {

    @GetMapping("/fruits")
    public Fruits m1() {
        return new Fruits();
    }
}

class Fruits {
    public String mango = "🥭";
    public String peach = "🍑";
    public String apple = "🍎";
    public String orange = "🍊";
}
