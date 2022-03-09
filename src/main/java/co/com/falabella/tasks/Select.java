package co.com.falabella.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.falabella.ui.HomePage.*;
import static co.com.falabella.ui.ProductListPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Select implements Task {

    private DataTable data;

    public Select(DataTable data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> values = data.asMaps(String.class, String.class);
        actor.attemptsTo(
                Click.on(MENUCATEGORY.of().resolveFor(actor)),
                MoveMouse.to(CATEGORY.of(String.valueOf(values.get(0).get("category")))),
                WaitUntil.the(SUBCATEGORY, isEnabled()).forNoMoreThan(8).seconds(),
                Click.on(SUBCATEGORY.of(String.valueOf(values.get(0).get("subcategory")))),
                Click.on(PRODUCT.of(String.valueOf(values.get(0).get("product"))))
        );
        actor.remember("product", values.get(0).get("product"));
    }

    public static Select theProductWithThe(DataTable data) {
        return Tasks.instrumented(Select.class, data);
    }
}