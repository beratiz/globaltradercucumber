$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US_001_DHLShipping_should_be_available_for_IpadPro_on_the_table.feature");
formatter.feature({
  "name": "US_001_DHLShipping_should_be_available_for_IpadPro_on_the_table",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@dhltest"
    }
  ]
});
formatter.scenario({
  "name": "TC_001 Testing if DHL shipping option for iPad Pro is available on the table",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dhltest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the start page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.DHLShippingStepDefinition.user_is_on_the_start_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Computers\u0026Office button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DHLShippingStepDefinition.user_clicks_on_the_Computers_Office_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Ipad link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DHLShippingStepDefinition.user_clicks_on_the_Ipad_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Apple Ipad Pro link",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DHLShippingStepDefinition.user_clicks_on_the_Apple_Ipad_Pro_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the Shipping \u0026 Payments tab",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.DHLShippingStepDefinition.user_clicks_on_the_Shipping_Payments_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"DHL\" is in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.DHLShippingStepDefinition.verify_is_in_the_table(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});