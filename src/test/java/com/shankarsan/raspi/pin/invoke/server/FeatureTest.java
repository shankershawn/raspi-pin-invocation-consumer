package com.shankarsan.raspi.pin.invoke.server;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = {"src/test/resources"}, tags = "@Ready")
public class FeatureTest {
}
