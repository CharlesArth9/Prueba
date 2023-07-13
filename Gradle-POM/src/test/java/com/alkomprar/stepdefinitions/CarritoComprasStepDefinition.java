package com.alkomprar.stepdefinitions;

import com.alkomprar.steps.BusquedaStep;
import com.alkomprar.steps.CarritoStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.awt.*;
import java.io.IOException;

public class CarritoComprasStepDefinition {


    @Steps
    CarritoStep carritoStep;
    @Steps
    BusquedaStep busquedaStep;

    @Cuando("^el usuario escribe un producto en la barra de busqueda$")
    public void realizarBusquedaProducto() throws IOException {
        busquedaStep.buscarProductos();
    }

    @Cuando("^escoge un producto aleatorio$")
    public void seleccionarProductoAleatoriamente() {
        busquedaStep.buscarProductoAleatorio();
    }

    @Cuando("^lo agrega al carrito de compras$")
    public void agregarAlCarritoDeCompras() {
        carritoStep.agregarCarrito();
    }

    @Entonces("^valida que el producto esta en el carrito de compras$")
    public void validarCarritoCompras() {
        carritoStep.validarMensaje();
    }

}
