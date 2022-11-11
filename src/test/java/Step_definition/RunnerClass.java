package Step_definition;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// HOW TO RUN MULTIPLE FILES SAME TIME!!
@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features =
        "src/test/resources/Features",
        plugin ={"pretty", "json:target/cucumber.json" },
        tags = {"~@ignore"}
)


public class RunnerClass {
}
