package com.example.springbootjsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class SimpleXSS {

    @RequestMapping("/simpleXSS1")
    @ResponseBody
    public String xss1(String xss, String key) {
        Map<String, String> map=new HashMap<>();
        map.put("xss",xss);
        map.put("clean","clean");
        return map.get(key);
    }

    @RequestMapping("/simpleXSS1_1")
    @ResponseBody
    public String xss1_1(String xss, String key) {
        Map<String, String> map=new LinkedHashMap<>();
        map.put("xss",xss);
        map.put("clean","clean");
        return map.get(key);
    }

    @RequestMapping("/simpleXSS1_2")
    @ResponseBody
    public String xss1_2(String xss, String key) {
        LinkedHashMap<String, String> map=new LinkedHashMap<>();
        map.put("xss",xss);
        map.put("clean","clean");
        return map.get(key);
    }

    @RequestMapping("/simpleXSS2")
    @ResponseBody
    public String xss2(String xss, int num) {
        if(num*num<0){
            return xss;
        } else {
            return "clean";
        }
    }

    @RequestMapping("/simpleXSS3")
    @ResponseBody
    public String xss3(String xss) {
        return xss.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace(" ", "&nbsp;")
                .replace("\"", "&#34;")
                .replace("'", "&#39;");
    }
}
