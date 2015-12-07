package com.vgalloy.example.controller;

import com.vgalloy.example.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vincent Galloy on 01/12/15.
 */

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/")
    String home() {
        return "Hello World!!";
    }

    @RequestMapping("/{a}/{b}")
    String add(@PathVariable("a")int a, @PathVariable("b")int b){
        return "" + sampleService.add(a, b);
    }

}