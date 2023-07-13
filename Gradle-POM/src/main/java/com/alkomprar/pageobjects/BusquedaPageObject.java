package com.alkomprar.pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class BusquedaPageObject extends PageObject {

    By txtBarraBusqueda = By.id("js-site-search-input");

    By btnLupa = By.xpath("(//i[@class='icon alk-icon-search-mobile'])[1]");
    By msjCarritoExitoso = By.xpath("//div[contains(text(),'Se agregó tu producto en el carrito satisfactoriamente')]");




    public By getTxtBarraBusqueda() {
        return txtBarraBusqueda;
    }

    public By getMsjCarritoExitoso() {
        return msjCarritoExitoso;
    }

    public By getBtnLupa() {
        return btnLupa;
    }


    public void seleccionarProductoAleatorio(){
        Random random = new Random(); // creo un objeto de tipo Random
        List<WebElementFacade> productos = findAll( "//h3[@class='product__item__top__title']");// creamos una lista de elementos de productos
        int totalProductos = productos.size()-1; // tenemos una variable que contiene el tamaño de la lista de productos
        int productoAleatorio = random.nextInt(totalProductos - 1) + 1; //tenemos una variable que elige un valor aleatorio entre 1 y el total de productos
        String xpath = "(//h3[@class='product__item__top__title'])["+productoAleatorio+"]"; // armamos nuestro xpath con el indice aleatorio
        getDriver().findElement(By.xpath(xpath)).click(); // click al xpath creado
    }
}
