package co.com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.falabella.ui.ProductListPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Add implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_PRODUCT_BAG),
                Click.on(VIEW_PRODUCT_BAG),
                Click.on(GO_SHOPPING),
                Enter.theValue("c.urrego@gmail.com").into(EMAIL_ADDRESS),
                Click.on(BTN_NEXT),
                Hit.the(Keys.ENTER).into(REGION),
                WaitUntil.the(REGION, isEnabled()).forNoMoreThan(8).seconds(),
                SelectFromOptions.byVisibleText("ANTIOQUIA").from(REGION),
                Hit.the(Keys.ENTER).into(CITY),
                WaitUntil.the(CITY, isEnabled()).forNoMoreThan(8).seconds(),
                SelectFromOptions.byVisibleText("MEDELLIN").from(CITY),
                Hit.the(Keys.ENTER).into(NEIGHBORHOOD),
                WaitUntil.the(NEIGHBORHOOD, isEnabled()).forNoMoreThan(8).seconds(),
                SelectFromOptions.byVisibleText("MEDELLIN").from(NEIGHBORHOOD),
                Click.on(BTN_NEXT_ADDRESS),
                Enter.theValue("calle 48 # 41-06").into(ADDRESS),
                Enter.theValue("torre libertadores ").into(DEPARTAMENT_ADDRESS),
                Click.on(BTN_ENTER_ADDRESS),
                Click.on(BTN_PAYMENT)
        );
    }

    public static Add theProductWithThe() {
        return Tasks.instrumented(Add.class);
    }
}