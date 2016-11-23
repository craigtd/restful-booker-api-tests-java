package com.testcraft.demo.bdd.core;

import com.testcraft.demo.bdd.context.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

@ContextConfiguration(classes = Context.class, initializers=ConfigFileApplicationContextInitializer.class)
public abstract class AbstractRestTestCase {

    @Autowired
    private TestRunProperties testRunProperties;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    protected RestTemplate getRestTemplate() {
        return restTemplate;
    }

    protected ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    protected String getEndpointUrl() {
        return testRunProperties.getEndpointUrl();
    }

}


