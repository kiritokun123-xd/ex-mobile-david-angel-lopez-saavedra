package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SwagLabLoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUser;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;
    public void openApp(){
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public void enterSearchInputUser(String user){
        txtUser.click();
        txtUser.sendKeys(user);
    }
    public void enterSearchInputPassword(String password){
        txtPassword.click();
        txtPassword.sendKeys(password);
    }
    public void clickLogin(){
        btnLogin.click();
    }

}
