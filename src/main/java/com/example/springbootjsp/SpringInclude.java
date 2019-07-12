package com.example.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringInclude {

    /**
     * PoC:
     * /springInclude?vulnerable=5-1
     */
    @RequestMapping("/springInclude")
    public String springinclude() {
        return "spring";
    }
}
