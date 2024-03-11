package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
					
					features= {".//Features/NewBikesIdentify.feature"},
					//features= {".//Features/Regression.feature"},
					//features= {".//Features/Smoke.feature"},
					glue="com.StepDefinitions",
					plugin= {"pretty", "html:reports/myreport.html",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					dryRun=false,//mapping scenarios to step definition methods
					monochrome=true,//avoid junk characters
					publish=true//this is to share cucumber report to view others
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
