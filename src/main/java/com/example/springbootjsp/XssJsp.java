package com.example.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class XssJsp {

    /**
     * PoC:
     * /xssjsp?xss=<h1>xx</h1>
     */
    @RequestMapping("/xssjsp")
    public String xss() {
        return "xss";
    }
}
