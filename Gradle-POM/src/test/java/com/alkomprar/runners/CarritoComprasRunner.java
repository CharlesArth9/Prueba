package com.alkomprar.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/carrito_compras.feature",
        glue = "com.alkomprar.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CarritoComprasRunner {
}
