package com.shankarsan.raspi.pin.invoke.server.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Slf4j
public class PoomStepDefinitions {

    private List<String> donuts;
    private Map<String, List<String>> fridge;

    @Given("donuts are available in fridge")
    public void givenDonutsAreAvailableInFridge() {
        donuts = List.of("Glazed", "Sugar Coated");
        fridge = new HashMap<>();
        fridge.put("donuts", donuts);
    }

    @When("poom finds donuts in fridge")
    public void whenPoomFindsDonutsInFridge() {
        Assertions.assertTrue(Optional.ofNullable(fridge)
                .map(e -> e.containsKey("donuts"))
                .orElse(false));
    }

    @Then("nom-nom-nom")
    public void nomNomNom() {
        Assertions.assertTrue(Optional.ofNullable(fridge)
                .map(e -> e.get("donuts"))
                .map(List::size)
                .orElse(0) > 0);
    }
}
