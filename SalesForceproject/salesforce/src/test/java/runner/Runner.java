package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
      features = {"src/test/resources/testdesignpackage" },
        glue = {"stepdefinition"} ,
        tags = "@sc05" ,
        plugin = {"pretty"}
)
public class Runner {


}
