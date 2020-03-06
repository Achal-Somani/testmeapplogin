package org.logintestMe;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",
				glue= {"org.logintestMe"},plugin= {"pretty","json:target/login.json"})

public class runner {

}
