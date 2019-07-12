package com.example.springbootjsp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspInclude {

    @RequestMapping("/include")
    public String include(){
        return "include";
    }
}
