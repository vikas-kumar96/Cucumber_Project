package CucumberTestng_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/practice/practice.feature" ,glue = "definitions")
public class CTRunner extends AbstractTestNGCucumberTests {

}

//AbstractTestNGCucumberTests