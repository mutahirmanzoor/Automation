package Stepdef;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"Stepdef"},
monochrome = true,
plugin={"pretty","html:target/HtmlReports.html"})
public class Runner {

}
