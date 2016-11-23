package com.testcraft.demo.bdd.stepDefinitions;

import com.testcraft.demo.bdd.core.AbstractRestTestCase;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.CoreMatchers.equalTo;
import org.springframework.http.*;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.http.HttpStatus.OK;

public class SampleTest extends AbstractRestTestCase{
    private ResponseEntity<String> response = null;
    private HttpEntity<String> httpEntity = null;
    private String requestJsonBody = null;
    private String RESOURCE_PATH = "/sample-resource-path";

//    @When("^I invoke GET /sample-resource-path$")
//    public void i_invoke_GET_sample_resource() throws IOException {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        httpEntity = new HttpEntity<String>(requestJsonBody, headers);
//        response = getRestTemplate().exchange(getEndpointUrl() + RESOURCE_PATH, HttpMethod.GET, httpEntity, String.class);
//    }
//
//    @Then("^I will receive a 200 OK response$")
//    public void iWillReceiveOKResponse() {
//        assertThat(response.getStatusCode(), equalTo(OK));
//    }
//
//    @Then("^the response contains \"([^\"]*)\"")
//    public void the_response_contains()  {
//
//    }
//
//    @Then("^the response does not contain \"([^\"]*)\"$")
//    public void the_response_does_not_contain()  {
//        String responseBody = response.getBody();
//        System.out.println("response body: " + responseBody);
//    }

}
