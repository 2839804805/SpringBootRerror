package com.example.errordeom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author wujing 
 */ 
@RestController
@RequestMapping("/api")
public class ApiController { 
 
 @RequestMapping(value = "/get")

 public HashMap<String, Object> get(@RequestParam String name) {
  HashMap<String, Object> map = new HashMap<String, Object>(); 
  map.put("title", "天天都是哈喽地求");
  map.put("name", name); 
  return map; 
 } 
}