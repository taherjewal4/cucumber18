package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
        glue = "../src/test/java/stepDefinations",
        features = "../src/main/resources/features/googlesearchtest.feature"
)
public class TestRunner {

    public static void main(String[] args) {
        JUnitCore.main(TestRunner.class.getCanonicalName());
    }
}
