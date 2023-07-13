package com.alkomprar.pageobjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPageObject extends PageObject {

    By btnCarritoYpagar = By.xpath("//button[@title='Buscar']");
    public By getBtnCarritoYpagar() {
        return btnCarritoYpagar;
    }


}
