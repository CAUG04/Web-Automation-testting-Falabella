package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {
    public static final Target PRODUCT = Target.the("Label Product").locatedBy("//*[@id='testId-searchResults-products']//b[.='{0}']");
    public static final Target ADD_PRODUCT_BAG = Target.the("Add Product to Bag").locatedBy("//*[@id='buttonForCustomers']/button");
    public static final Target VIEW_PRODUCT_BAG = Target.the("View Product to Bag").locatedBy("//*[@id='linkButton']");
    public static final Target GO_SHOPPING = Target.the("Go Shopping").locatedBy("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase' and 'Ir a comprar']");
    public static final Target EMAIL_ADDRESS = Target.the("Email Address").locatedBy("//*[@id='emailAddress']");
    public static final Target BTN_NEXT = Target.the("Button next").locatedBy("//button[@class='fbra_button fbra_test_button fbra_emailInputForm__submitButton fbra_test_emailInputForm__submitButton' and 'Continuar']");
    public static final Target REGION = Target.the("Dropdowns region").locatedBy("//*[@id='region']");
    public static final Target CITY = Target.the("Dropdowns city").locatedBy("//*[@id='ciudad']");
    public static final Target NEIGHBORHOOD = Target.the("Dropdowns neighborhood").locatedBy("//*[@id='comuna']");
    public static final Target BTN_NEXT_ADDRESS = Target.the("Button next Address").locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__field04' and 'Continuar']");
    public static final Target ADDRESS = Target.the("Address").locatedBy("//*[@id='address']");
    public static final Target DEPARTAMENT_ADDRESS = Target.the("Departament Address").locatedBy("//*[@id='departmentNumber']");
    public static final Target BTN_ENTER_ADDRESS = Target.the("Button enter Address").locatedBy("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress' and 'Ingresar dirección']");
    public static final Target BTN_PAYMENT = Target.the("Button Payment").locatedBy("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton' and 'Continuar']");
}