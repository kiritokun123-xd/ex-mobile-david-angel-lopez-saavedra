package com.nttdata.stepsdefinitions;

import com.nttdata.screens.SwagLabLoginScreen;
import com.nttdata.steps.SwaglabSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabStepsDefs {
    @Steps
    SwaglabSteps swaglabSteps;
    @Given("me encuentro en el login de SwagLab")
    public void meEncuentroEnElLoginDeSwagLab() {
        swaglabSteps.startApp();
    }

    @When("escribo mis credenciales {string} y {string}")
    public void escriboMisCredencialesY(String user, String password) {
        swaglabSteps.searchByText(user, password);
    }

    @And("hago click en boton Login")
    public void hagoClickEnBotonLogin() {
        swaglabSteps.clickLogin();
    }

    @Then("se valida el titulo {string}")
    public void seValidaElTitulo(String tittle) {
        Assert.assertEquals(swaglabSteps.getTitleText(), tittle);
    }

    @And("al menos exista un item")
    public void alMenosExistaUnItem() {
        Assert.assertNotNull(swaglabSteps.getItemProduct());
    }
}
