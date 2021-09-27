package com.jpmorgan.GoogleSearch.testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/",
		glue = {"stepdefinitions"},
//		dryRun = true,
		monochrome = true, 
		plugin = {"pretty","junit:target/JunitReports/reports.xml",
							"json:target/JsonReports/reports.json", 
							"html:target/HTMLReports/reports.html"}
		)
public class TestRunner {

}
