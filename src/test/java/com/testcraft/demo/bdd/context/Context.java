package com.testcraft.demo.bdd.context;

import com.testcraft.demo.bdd.core.TestRunProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Context {
    // to load yaml properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    // to load yaml properties
    @Bean
    public static YamlPropertySourceLoader yamlPropertySourceLoader(){
        return new YamlPropertySourceLoader();
    }

    @Bean public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .configure(SerializationFeature.WRAP_ROOT_VALUE, true)
                .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true)
                .configure(SerializationFeature.INDENT_OUTPUT, true);
    }

    @Bean
    public TestRunProperties testRunProperties() {return new TestRunProperties();}
}
