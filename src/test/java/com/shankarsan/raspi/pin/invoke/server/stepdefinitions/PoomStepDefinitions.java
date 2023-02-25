package com.shankarsan.raspi.pin.invoke.server.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PoomStepDefinitions {

    @Given("donuts are available in fridge")
    public void givenDonutsAreAvailableInFridge(){
        Assertions.assertTrue(true);
    }

    @When("poom finds donuts in fridge")
    public void whenPoomFindsDonutsInFridge(){
        Assertions.assertTrue(true);
    }

    @Then("nom-nom-nom")
    public void nomNomNom(){
        Assertions.assertTrue(true);
    }
}
