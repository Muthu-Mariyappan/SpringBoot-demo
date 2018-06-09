package org.tact.base.rest;


import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	
	@RequestMapping(value = "/base")
    public Map<String,Object> listUsers() {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        return  map;
    }
	
	@RequestMapping(value = "/base/{name}")
    public Map<String,Object> reverseListUsers(@PathVariable String name) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("name", name);
        map.put("reversed_name", new StringBuilder(name).reverse().toString());
        return  map;
    }
}