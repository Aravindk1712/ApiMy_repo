package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/resources/feature",
		glue= {"stepDefine"},
		
				 //tags="@smokecheck",
		
		
			plugin = {"json:target/cucumber.json"}
//		"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm" tags="@smoke",
		)
public class test_runner {

}
