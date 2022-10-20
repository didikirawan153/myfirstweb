package com.myfirstweb.spring.myfirstweb.hallo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHalloController {

    @RequestMapping("say-hallo")
    @ResponseBody
    public String sayHello(){
        return "Hai Ini Coba";
    }

    @RequestMapping("say-hallo-html")
    public String sayHelloHtml(){
        return "hallo/sayHallo";
    }
}
