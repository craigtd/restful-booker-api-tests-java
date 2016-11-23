Feature: Book a hotel using restful booker platform

  @ping
  Scenario: Check the application is running
    When I call GET /ping
    Then I will receive a CREATED response

  @ping
  Scenario: Retrieve list of bookings
    When I call GET /booking
    Then I will receive a OK response
    And the response will include a list of booking IDs


  Scenario: Get booking details
    When I call GET /booking/1
    Then I will receive a OK response
    And the response will incude details for that booking

  Scenario: Create a booking
    Given I have the following booking request
    """
    {
        "firstname" : "Sally",
        "lastname" : "Brown",
        "totalprice" : 111,
        "depositpaid" : true,
        "additionalneeds" : "Breakfast",
        "bookingdates" : {
            "checkin" : "2013-02-23",
            "checkout" : "2014-10-23"
        }
    }
    """
    When I invoke POST /booking
    Then I will receive a CREATED response
