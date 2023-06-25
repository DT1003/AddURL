package com.example.Controller;

import ch.qos.logback.core.model.Model;
import com.example.Utility.AddUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class AddController {

    @Autowired
    private AddUtility addUtility;

    @PostMapping(value = "/add/{num1}/{num2}", produces ="application/json")
    public int addNumbers(@PathVariable int num1, @PathVariable int num2) {
        int addition = addUtility.addition(num1, num2);
        return addition;
    }
//    @PostMapping(value="/add")
//    public int add(@RequestBody Model model ){
//        return model.getNum1()+
//                model.getNum2();
//    }
}
