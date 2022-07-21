package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\kragu\\eclipse-workspace\\Cloudbnk\\src\\test\\resources\\logout.feature"},glue= {"org.stepdef"},monochrome=true,
dryRun=false)
public class Testrunnerclass {
 
}
