package com.testcraft.demo.bdd.core;

import org.springframework.beans.factory.annotation.Value;

public class TestRunProperties {

    @Value("${endpointUrl}")
    private String endpointUrl;

    public String getEndpointUrl() {
        return endpointUrl;
    }
}
