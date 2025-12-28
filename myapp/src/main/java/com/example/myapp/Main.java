package com.example.myapp;
import java.util.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.Math.M;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;



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
public class Main {

    @GetMapping("/fact")
    public Map<String, Object> f(@RequestParam int n) {

        Map<String, Object> res = new HashMap<>();

        M obj = new M();
        res.put("number", n);
        res.put("factorial", obj.f(n));

        return res;   // Spring automatically converts to JSON
    }

     @GetMapping("/sum/{n}")
    public Map<String, Object> sum(@PathVariable int n) {

        Map<String, Object> res = new HashMap<>();

        M obj = new M();
        res.put("number", n);
        res.put("sum", obj.sum(n));

        return res;   // JSON response
    }

     @GetMapping("/fib")
    public Map<String, Object> fibonacci(@RequestHeader("X-Number") int n) {

        Map<String, Object> res = new HashMap<>();
        M obj = new M();

        res.put("number", n);
        res.put("fibonacci", obj.fibonacciSeries(n));  // returns array

        return res; // Spring converts Map to JSON
    }

    

}


