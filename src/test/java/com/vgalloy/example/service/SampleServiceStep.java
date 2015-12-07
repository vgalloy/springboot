package com.vgalloy.example.service;

import com.vgalloy.example.MainServer;
import cucumber.api.java.en.Then;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


/**
 * Created by Vincent Galloy on 02/12/15.
 */

@ContextConfiguration(classes = MainServer.class, loader = SpringApplicationContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SampleServiceStep {
    @Autowired
    private SampleService sampleService;

    @Then("Two number (\\d+) and (\\d+) give (\\d+)")
    public void testAddFunction2(int a, int b, int c) {
        assertThat(sampleService.add(a, b), equalTo(c));
    }

}
