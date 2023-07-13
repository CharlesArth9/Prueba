package com.alkomprar.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("https://www.alkomprar.com/")
public class PaginaPrincipalPageObject extends PageObject {

    By btnMiCuenta = By.xpath("(//span[text()='Mi cuenta'])[1]");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }
    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
