package com.vgalloy.example.controller;

import com.vgalloy.example.model.Person;
import com.vgalloy.example.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.annotation.XmlSchema;

/**
 * Created by Vincent Galloy on 01/12/15.
 */

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping("/")
    public String home() {
        return "Hello World!!";
    }

    @RequestMapping("/{a}/{b}")
    public String add(@PathVariable("a")int a, @PathVariable("b")int b){
        return "" + sampleService.add(a, b);
    }

    /*
     You can use the next CLI to test the method "create"
     curl -X POST -H "Content-Type:application/json" localhost:8081/create -d '{"id":10, "username":"nom", "password" : "mdp" }'
    */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Person create(@RequestBody Person person){
        return sampleService.create(person);
    }

}