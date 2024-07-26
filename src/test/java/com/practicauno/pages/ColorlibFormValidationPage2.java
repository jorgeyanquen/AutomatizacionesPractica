package com.practicauno.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class ColorlibFormValidationPage2 extends PageObject {

    //campo Required
    @FindBy(xpath = "//*[@id='required2']")
    public WebElementFacade txtRequired;

    //campo Email
    @FindBy(xpath = "//*[@id='email2']")
    public WebElementFacade txtEmail;

    //campo password1
    @FindBy(xpath = "//*[@id='password2']")
    public WebElementFacade txtPass;

    //campo passwordvalidacion
    @FindBy(xpath = "//*[@id='confirm_password2']")
    public WebElementFacade txtPassValidation;


    //campo date
    @FindBy(xpath = "//*[@id='date2']")
    public WebElementFacade txtDate;

    //campo url
    @FindBy(xpath = "//*[@id='url2']")
    public WebElementFacade txtUrl;

    //campo Digits Only
    @FindBy(xpath = "//*[@id='digits']")
    public WebElementFacade txtOnly;

    //campo Range
    @FindBy(xpath = "//*[@id='range']")
    public WebElementFacade txtRange;

    //campo seleccion
    @FindBy(xpath = "//*[@id='agree2']")
    public WebElementFacade btnseleccion;

    //boton validar
    @FindBy(xpath = "//*[@id=\"block-validate\"]/div[10]/input")
    public WebElementFacade btnvalidar;

    //globo informativo
    @FindBy(xpath = "//*[@id=\"range-error\"]")
    public WebElementFacade globoInformativo2;

    public void Required(String datoPrueba){
        txtRequired.click();
        txtRequired.clear();
        txtRequired.sendKeys(datoPrueba);
    }

    public void Email(String datoPrueba){
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(datoPrueba);
    }

    public void Password1(String datoPrueba){
        txtPass.click();
        txtPass.clear();
        txtPass.sendKeys(datoPrueba);
    }

    public void Password2(String datoPrueba){
        txtPassValidation.click();
        txtPassValidation.clear();
        txtPassValidation.sendKeys(datoPrueba);
    }
    public void Date(String datoPrueba){
        txtDate.click();
        txtDate.clear();
        txtDate.sendKeys(datoPrueba);
    }

    public void Url(String datoPrueba){
        txtUrl.click();
        txtUrl.clear();
        txtUrl.sendKeys(datoPrueba);
    }

    public void Digital(String datoPrueba){
        txtOnly.click();
        txtOnly.clear();
        txtOnly.sendKeys(datoPrueba);
    }

    public void Range(String datoPrueba){
        txtRange.click();
        txtRange.clear();
        txtRange.sendKeys(datoPrueba);
    }
    public void seleccion(){
        btnseleccion.click();
    }
    public void validate(){
        btnvalidar.click();
    }
    public void form_sin_errores2(){
        assertThat(globoInformativo2.isCurrentlyVisible(),is(false));
    }
    public void form_con_errores2(){
        assertThat(globoInformativo2.isCurrentlyVisible(), is(true));
    }
}
