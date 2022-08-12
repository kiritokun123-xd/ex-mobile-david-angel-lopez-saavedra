package com.nttdata.steps;

import com.nttdata.screens.*;
import net.thucydides.core.annotations.Step;

public class SwaglabSteps {
    SwagLabLoginScreen swagLabLoginScreen;
    SwagLabProductsScreen swagLabProductsScreen;


    @Step("Abre el inicio de la app")
    public void startApp(){
        swagLabLoginScreen.openApp();
    }

    @Step("Ingreso de credenciales {user} {password}")
    public void searchByText(String user, String password){
        swagLabLoginScreen.enterSearchInputUser(user);
        swagLabLoginScreen.enterSearchInputPassword(password);
    }

    @Step("Click en boton login")
    public void clickLogin(){
        swagLabLoginScreen.clickLogin();
    }

    @Step("Obtiene el texto del titulo")
    public String getTitleText(){
        return swagLabProductsScreen.getTitleText();
    }
    @Step("Obtiene un item")
    public Object getItemProduct(){
        return swagLabProductsScreen.getItemProduct();
    }
}
