package com.alkomprar.stepdefinitions;

import com.alkomprar.steps.RegistroStep;
import com.alkomprar.steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class RegistroStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    RegistroStep registroStep;

    @Dado("^que el usuario se encuentra en la pagina web de Alkomprar$")
    public void queElUsuarioSeEncuentraEnLaPaginaWeb() {
        paginaPrincipalStep.abrirNavegador();
    }

    @Cuando("^el usuario ingresa los datos para registrarse$")
    public void elIngreseSusDatosParaRegistrarse() throws IOException {
        paginaPrincipalStep.clickBtnMiCuenta();
        registroStep.ingresarCorreo();
        registroStep.ingresarDatos();
    }

    @Entonces("^valida que visualizara su cuenta$")
    public void ValidarRegistroExitoso() {
        registroStep.validarRegistroExitoso();
    }

}
