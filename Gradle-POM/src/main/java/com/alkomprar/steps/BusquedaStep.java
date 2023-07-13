package com.alkomprar.steps;

import com.alkomprar.pageobjects.BusquedaPageObject;
import com.alkomprar.utils.DatosExcel;
import com.alkomprar.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import java.io.IOException;

public class BusquedaStep {
    DatosExcel datosExcel = new DatosExcel();
    static final String LIBRO_CARRITO = "Carrito";
    static final String EXCEL = "DatosReto.xlsx";
    BusquedaPageObject busqueda;
    EsperaImplicita esperaImplicita = new EsperaImplicita();


    @Step
    public void buscarProductos() throws IOException {
        String producto = datosExcel.leerDatosExcel(EXCEL, LIBRO_CARRITO, 1, 0);
        busqueda.getDriver().findElement(busqueda.getTxtBarraBusqueda()).sendKeys(producto);
        //busqueda.getDriver().findElement(busqueda.getBtnLupa()).click();
        busqueda.getDriver().get("https://www.alkomprar.com/search/?text="+producto+"");
    }

    @Step
    public void buscarProductoAleatorio() {
        esperaImplicita.esperaImplicita(1000);
        busqueda.seleccionarProductoAleatorio();
    }
}
