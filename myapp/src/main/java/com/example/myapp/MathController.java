package com.example.myapp;

import org.springframework.web.bind.annotation.*;
import com.example.myapp.Math.M;
import java.util.HashMap;
import java.util.Map;

// DTO for request body
class MathRequest {
    private int number;

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}

@CrossOrigin(origins = "*")  // Allow requests from any origin
@RestController
@RequestMapping("/math") // base path
public class MathController {

    @PostMapping("/body")
    public Map<String, Object> mathOperations(@RequestBody MathRequest request) {

        int n = request.getNumber();
        M obj = new M();

        Map<String, Object> res = new HashMap<>();
        res.put("number", n);
        res.put("factorial", obj.f(n));
        res.put("sum", obj.sum(n));
        res.put("fibonacci", obj.fibonacciSeries(n));

        return res;  // Spring automatically converts Map to JSON
    }
}




