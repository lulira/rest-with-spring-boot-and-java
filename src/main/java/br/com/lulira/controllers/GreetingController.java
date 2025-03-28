package br.com.lulira.controllers;

import br.com.lulira.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private String template = "Hello, %S!";
    private AtomicLong counter  = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting (

            @RequestParam(value = "name", defaultValue = "word")
            String name){

        return new Greeting(counter.incrementAndGet(), name);
    }

}
