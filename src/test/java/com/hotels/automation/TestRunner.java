package com.hotels.automation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/features",
        glue="",
        tags="@hotel",
        plugin={"pretty", "html:target/automationreport"} 
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
