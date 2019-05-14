package com.darrenforsythe.resourcebeanoverride;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MyController {
    @Resource(name = "lookup")
    private Map<String, String> lookup;


    @GetMapping
    public Map<String, String> getLookup() {
        return lookup;
    }
}