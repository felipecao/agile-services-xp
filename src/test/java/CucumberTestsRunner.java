import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"html:target/cucumber"})
public class CucumberTestsRunner {
}
