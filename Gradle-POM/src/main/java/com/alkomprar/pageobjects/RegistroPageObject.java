package com.alkomprar.pageobjects;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegistroPageObject extends PageObject {

    By txtCorreo = By.id("js-login-email");
    By txtNombre = By.id("register.firstName");
    By txtApellido = By.id("register.lastName");
    By txtTelefono = By.id("register.mobileNumber");
    By chkAutorizar = By.xpath("//label[@for='registerChkTermsConditions']");
    By btnContinuarRegistro = By.xpath("(//button[contains(text(),'Continuar')])[1]");
    By btnContinuarLogin = By.id("js-login-continue");

    By msjMiCuenta = By.xpath("//h4[text()='Mi perfil']|div[@class='account-section-header visible module-title']");


    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtNombre() {
        return txtNombre;
    }

    public By getTxtApellido() {
        return txtApellido;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getChkAutorizar() {
        return chkAutorizar;
    }

    public By getBtnContinuarRegistro() {
        return btnContinuarRegistro;
    }

    public By getBtnContinuarLogin() {
        return btnContinuarLogin;
    }
    public By getMsjMiCuenta() {
        return msjMiCuenta;
    }

}
