package com.practicauno.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {
    //Menu forms
    @FindBy(xpath = "//*[@id='menu']/li[6]/a")
    public WebElement menuForms;

    //submenu form general
    @FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
    public WebElement menuFormGenerals;

    //Submenu Form Validation
    @FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[2]/a")
    public WebElement menuFormValidation;

    //Form Validation - label informativo
    @FindBy(xpath = "//*[@id=\"top\"]/header/div[2]")
    public WebElement lblFormValidation;


    public void menuFormValidation() {
        menuForms.click();
        menuFormValidation.click();
        String strMensaje = lblFormValidation.getText();
        assertThat(strMensaje, containsString("Form Validation"));

    }
}
