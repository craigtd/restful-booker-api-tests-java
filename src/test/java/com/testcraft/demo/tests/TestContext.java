package com.testcraft.demo.tests;

/**
 * Created by ctduncan on 10/03/2016.
 */
import com.testcraft.demo.bdd.context.Context;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.PostConstruct;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Context.class, initializers=ConfigFileApplicationContextInitializer.class)
public class TestContext {

    @Value("${endpointUrl}")
    private String endpointUrl;

    private String val;

    @PostConstruct
    void constructUrl(){
        val = endpointUrl;
    }

    @Test
    public void resolveUrlFromContext() {
        System.out.println("******************************************");
        System.out.println(val);
        System.out.println("******************************************");
    }


}
