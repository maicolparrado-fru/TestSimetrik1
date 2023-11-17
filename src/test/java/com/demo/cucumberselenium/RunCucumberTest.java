package com.demo.cucumberselenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/demo/features",
        glue = "com.demo",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}