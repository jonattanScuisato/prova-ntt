package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"steps", "settings"},
        tags = "@tag001",
        plugin = {"json:target/cucumber.json"},
        snippets = CucumberOptions.SnippetType.UNDERSCORE
)

public class RunnerTest {
}
