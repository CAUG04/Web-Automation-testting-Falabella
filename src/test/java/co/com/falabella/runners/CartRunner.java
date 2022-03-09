package co.com.falabella.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"co.com.falabella.stepdefinitions"},
        plugin = {"pretty"},
        features = {"src/test/resources/features/cart.feature"},
        tags = "",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CartRunner {
}