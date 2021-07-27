package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\QSP\\eclipse-workspace\\seleniumpro\\BddCucumber_Framework\\src\\test\\"
		+ "resources\\sceanrios.feature",
glue= {"stepdefinition"})

public class Run {
	

}
