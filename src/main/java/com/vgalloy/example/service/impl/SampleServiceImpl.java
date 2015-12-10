package com.vgalloy.example.service.impl;


import com.vgalloy.example.model.Person;
import com.vgalloy.example.service.SampleService;
import org.springframework.stereotype.Service;

/**
 * Created by Vincent Galloy on 02/12/15.
 */
@Service
public class SampleServiceImpl implements SampleService {
    @Override
    public int add(int a, int b){
        return a + b;
    }

    @Override
    public Person create(Person person) {
        person.setId(Long.valueOf(new Double(Math.random() * 100).longValue()));
        return person;
    }

}
