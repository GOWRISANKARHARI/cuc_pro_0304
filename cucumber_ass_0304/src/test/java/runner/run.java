package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"pretty" , "json:target/cucumber-Report/LoginOrangeHRMTestNGReport.json"}
				,features ="src/test/resources/com/feature/login1.feature"
				,glue ="cucumber_ass_03042025"
		)
public class run extends AbstractTestNGCucumberTests{

}