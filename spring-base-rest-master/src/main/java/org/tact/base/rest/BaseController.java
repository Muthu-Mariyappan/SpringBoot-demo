package org.tact.base.rest;
/**
*Author: Muthu Mariyappan
*Date : 09/06/2018
*Program Name: SpringBoot-demo-Reversing-String
*/

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
	/***Given method which prints default json object on visiting /base**/
	@RequestMapping(value = "/base") //Maps /base call to listUsers method
    public Map<String,Object> listUsers() {
        Map<String, Object> map = new LinkedHashMap<String, Object>(); //Using linkedHashmap to preserve insertion order
        map.put("one", "two");
        map.put("three", "four");
        map.put("five", "six");
        map.put("seven", "eight");
        return  map;
    }
	
	@RequestMapping(value = "/base/{name}") // Maps /base with passed value as /{value}
    public Map<String,Object> reverseListUsers(@PathVariable String name) { //@PathVariable to access the passed value
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("name", name);
        map.put("reversed_name", new StringBuilder(name).reverse().toString()); // java StringBuilder method to reverse a String
        return  map; // Returns the original and reversed string as a result
    }
}
