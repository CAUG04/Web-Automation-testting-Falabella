package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target PRODUCT_NAME_ON_CART = Target.the("Name of product on cart").locatedBy("//*[@id='fbra_checkoutOrderSummary']//span[.='Antena para TDT HD']");
}