package com.example.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
    @RequestMapping("/evil")
    public String evil(){
        return "evil";
    }
}
