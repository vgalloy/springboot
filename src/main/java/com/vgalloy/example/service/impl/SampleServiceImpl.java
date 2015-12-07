package com.vgalloy.example.service.impl;


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

}
