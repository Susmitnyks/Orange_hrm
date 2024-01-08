package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
//        glue = {"src/test/java/Stepdefinition"},
        glue = {"Stepdefinition"},
        /*monochrome = true,
        tags = ("@Login_test_case"),
        dryRun = false,*/
        plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json" }
)
public class MyTestRunner{

}
