package com.testcraft.demo.bdd.stepDefinitions;

import com.testcraft.demo.bdd.core.AbstractRestTestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.http.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

public class RestfulBookerTest extends AbstractRestTestCase {
  private ResponseEntity<String> response = null;
  private HttpEntity<String> httpEntity = null;
  private String requestJsonBody = null;
  private String BOOKING_RESOURCE_PATH = "/booking";
  private String PING_RESOURCE_PATH = "/ping";

  @When("^I call GET /ping$")
  public void i_call_GET_ping() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    httpEntity = new HttpEntity<String>(requestJsonBody, headers);
    response = getRestTemplate().exchange(getEndpointUrl() + PING_RESOURCE_PATH, HttpMethod.GET, httpEntity, String.class);
  }

  @Then("^I will receive a CREATED response$")
  public void iWillReceiveCreatedResponse() {
    assertThat(response.getStatusCode(), equalTo(CREATED));
  }

  @When("^I call GET /booking$")
  public void i_call_GET_booking() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    httpEntity = new HttpEntity<String>(requestJsonBody, headers);
    response = getRestTemplate().exchange(getEndpointUrl() + BOOKING_RESOURCE_PATH, HttpMethod.GET, httpEntity, String.class);
  }

  @Then("^the response will include a list of booking IDs$")
  public void the_response_will_include_a_list_of_booking_ids()  {
    String responseBody = response.getBody();
    System.out.println("Response body: " + responseBody);

  }

  @Then("^I will receive a OK response$")
  public void i_will_receive_a_OK_response() throws Throwable {
    assertThat(response.getStatusCode(), equalTo(OK));
  }

  @When("^I call GET /booking/(\\d+)$")
  public void iCallGETBooking(int bookingId) {

  }

  @And("^the response will incude details for that booking$")
  public void theResponseWillIncudeDetailsForThatBooking() {

  }







  @Given("^I have the following booking request$")
  public void i_have_the_following_request(String bookingRequest) {
    requestJsonBody = bookingRequest;
    System.out.println("Request body: " + requestJsonBody);
  }

  @When("^I invoke POST /booking$")
  public void i_invoke_POST_booking() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    httpEntity = new HttpEntity<String>(requestJsonBody, headers);
    System.out.println("url: " + getEndpointUrl() + BOOKING_RESOURCE_PATH);

    response = getRestTemplate().exchange(getEndpointUrl() + BOOKING_RESOURCE_PATH, HttpMethod.POST, httpEntity, String.class);
  }



}
