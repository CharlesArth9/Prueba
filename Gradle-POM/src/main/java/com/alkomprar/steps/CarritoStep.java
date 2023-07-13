package com.alkomprar.steps;

import com.alkomprar.pageobjects.BusquedaPageObject;
import com.alkomprar.pageobjects.CarritoPageObject;
import com.alkomprar.utils.DatosExcel;
import com.alkomprar.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CarritoStep {

    CarritoPageObject carrito;
    BusquedaPageObject busqueda;
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();



    @Step
    public void agregarCarrito(){
        carrito.getDriver().findElement(carrito.getBtnCarritoYpagar()).click();
    }

    @Step
    public void validarMensaje(){
        String mensajeObtenido = busqueda.getDriver().findElement(busqueda.getMsjCarritoExitoso()).getText().trim();
        assertEquals(mensajeObtenido,"Se agregó tu producto en el carrito satisfactoriamente");
    }
}
