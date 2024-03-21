package it.marconi.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



//Stereotype annotation0 
@Controller

@RequestMapping("/")
public class HelloController {
    
    
    //  C.R.U.D (Create Read Update Delete) -> HTTP(POST,GET,PUT,DELETE)
    @GetMapping
    public String greet(){
        return "hello-world";
    }
    
    @GetMapping(params = "papero")
    public String greetParameter() {
        return "hello-world-param";
    }
    
}
