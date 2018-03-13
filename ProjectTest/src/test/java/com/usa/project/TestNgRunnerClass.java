package com.usa.project;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber", "json:target/cucumber.json"},

		features= {"src/main/resources/AgileTrailblazersEmailValidation.feature"},
		glue= {"com.usa.project"}
				
		//,tags= {"@login"}
		)


public class TestNgRunnerClass extends AbstractTestNGCucumberTests{

}


