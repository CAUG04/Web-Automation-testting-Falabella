package co.com.falabella.stepdefinitions;

import co.com.falabella.questions.ProductWas;
import co.com.falabella.tasks.Add;
import co.com.falabella.tasks.GoTo;
import co.com.falabella.tasks.Select;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CartStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened the ecommerce")
    public void givenThatUserHasOpenedTheEcommerce(String actorName) {
        theActorCalled(actorName).wasAbleTo(GoTo.theUrl());
    }

    @When("he select the product from the section")
    public void whenHeSelectTheProductFromTheSection(DataTable data) {
        theActorInTheSpotlight().attemptsTo(Select.theProductWithThe(data));
    }

    @And("he adds the product to the cart with")
    public void heAddsTheProductToTheCartWith() {
        theActorInTheSpotlight().attemptsTo(Add.theProductWithThe());
    }

    @Then("he should see the added product in the cart")
    public void thenHeShouldSeeTheAddedProductInTheCart() {
        theActorInTheSpotlight().should(seeThat(ProductWas.Added()));
    }
}