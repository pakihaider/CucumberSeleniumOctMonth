package com.hotels.automation.framework;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase{

    @Before
    public void runBeforeEachScenario(){
        tearUp();
    }

    @After
    public void runAfterEachScenario(){
        tearDown();
    }
}
