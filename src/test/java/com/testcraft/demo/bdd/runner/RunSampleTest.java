package com.testcraft.demo.bdd.runner;

        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com/testcraft/demo/bdd/features/sample.feature"},
        format = {"pretty", "json:target/cucumber.json" },
        glue = {"com.testcraft.demo"}
)

public class RunSampleTest {


}
