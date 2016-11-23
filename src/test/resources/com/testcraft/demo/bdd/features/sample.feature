Feature: sample feature
  As a QA
  I want to test a RESTful API
  So that I can prove it works


  Scenario Outline: basic test
    When I invoke GET /sample-resource-path
    Then I will receive a 200 OK response
    And the response contains <contains>
    And the response does not contain <does-not-contain>

    Examples: Markets configured in FMS
      | id        | contains     | does-not-contain |
      | 10        | "this"       | "that"            |