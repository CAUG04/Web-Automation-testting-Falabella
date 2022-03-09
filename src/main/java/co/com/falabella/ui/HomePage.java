package co.com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target MENUCATEGORY = Target.the("Label Menu Category").locatedBy("//*[@id='testId-HamburgerBtn-toggle']//span[.='Categorías']");
    public static final Target CATEGORY = Target.the("Label Category").locatedBy("//*[@id='cross-header']//p[.='{0}']");
    public static final Target SUBCATEGORY = Target.the("Label SubCategory").locatedBy("//*[@id='cross-header']//a[.='Accesorios TV']");
}