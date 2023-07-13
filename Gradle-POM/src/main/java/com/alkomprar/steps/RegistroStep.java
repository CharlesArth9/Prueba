package com.alkomprar.steps;

import com.alkomprar.pageobjects.PaginaPrincipalPageObject;
import com.alkomprar.pageobjects.RegistroPageObject;
import com.alkomprar.utils.DatosExcel;
import com.alkomprar.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class RegistroStep {

    RegistroPageObject registro = new RegistroPageObject();
    PaginaPrincipalPageObject home;
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    //PasarMouse pasarMouse = new PasarMouse();
    static final String LIBRO_REGISTRO = "Registro";
    static final String EXCEL = "DatosReto.xlsx";

    @Step
    public void ingresarCorreo() throws IOException {
        registro.getDriver().findElement(registro.getTxtCorreo())
                .sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 0));
        registro.getDriver().findElement(registro.getBtnContinuarLogin()).click();
    }

    @Step
    public void ingresarDatos() throws IOException {
        registro.getDriver().findElement(registro.getTxtNombre())
                .sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 1));
        registro.getDriver().findElement(registro.getTxtApellido())
                .sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 2));
        registro.getDriver().findElement(registro.getTxtTelefono())
                .sendKeys(datosExcel.leerDatosExcel(EXCEL, LIBRO_REGISTRO, 1, 3));
        home.scroll();
        registro.getDriver().findElement(registro.getChkAutorizar()).click();
        registro.getDriver().findElement(registro.getBtnContinuarRegistro()).click();
        //home.getDriver().findElement(home.getBtnMiCuenta()).click();
    }


    @Step
    public void validarRegistroExitoso(){
        Assert.assertThat(registro.getDriver().findElement(registro.getMsjMiCuenta())
                .isDisplayed(), Matchers.is(true));
    }


}
