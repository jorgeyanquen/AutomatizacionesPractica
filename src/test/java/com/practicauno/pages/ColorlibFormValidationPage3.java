package com.practicauno.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ColorlibFormValidationPage3 extends PageObject {

    //campo Required
    @FindBy(xpath = "//*[@id=\"required\"]")
    public WebElementFacade txtRequired;

    //campo Email
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElementFacade txtEmail;

    //campo Password1
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElementFacade txtPass1;

    //campo Password2
    @FindBy(xpath = "//*[@id=\"confirm_password\"]")
    public WebElementFacade txtPass2;

    //campo Date
    @FindBy(xpath = "//*[@id=\"date\"]")
    public WebElementFacade txtDate;

    //campo Url
    @FindBy(xpath = "//*[@id=\"url\"]")
    public WebElementFacade txtUrl;

    //campo seleccion
    @FindBy(xpath = "//*[@id=\"agree\"]")
    public WebElementFacade btnseleccion;

    //campo Minichar
    @FindBy(xpath = "//*[@id=\"minsize\"]")
    public WebElementFacade txtMinichar;

    //campo Maxichar
    @FindBy(xpath = "//*[@id=\"maxsize\"]")
    public WebElementFacade txtMaxichar;

    //campo Min
    @FindBy(xpath = "//*[@id=\"minNum\"]")
    public WebElementFacade txtmin;

    //campo Max
    @FindBy(xpath = "//*[@id=\"maxNum\"]")
    public WebElementFacade txtMax;

    //boton validar
    @FindBy(xpath = "//*[@id=\"inline-validate\"]/div[12]/input")
    public WebElementFacade btnvalidar;

    //globo informativo
    @FindBy(xpath = "//*[@id=\"email-error\"]")
    public WebElementFacade globoInformativo3;

    public void Required(String datoPrueba) {
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
        txtPass1.click();
        txtPass1.clear();
        txtPass1.sendKeys(datoPrueba);
    }

    public void Password2(String datoPrueba){
        txtPass2.click();
        txtPass2.clear();
        txtPass2.sendKeys(datoPrueba);
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

    public void seleccion(){
        btnseleccion.click();
    }

    public void Minichar(String datoPrueba){
        txtMinichar.click();
        txtMinichar.clear();
        txtMinichar.sendKeys(datoPrueba);
    }

    public void Maxichar(String datoPrueba){
        txtMaxichar.click();
        txtMaxichar.clear();
        txtMaxichar.sendKeys(datoPrueba);
    }

    public void Min(String datoPrueba){
        txtmin.click();
        txtmin.clear();
        txtmin.sendKeys(datoPrueba);
    }

    public void Max(String datoPrueba){
        txtMax.click();
        txtMax.clear();
        txtMax.sendKeys(datoPrueba);
    }
    public void validate(){
        btnvalidar.click();
    }

    public void form_sin_errores3(){
        assertThat(globoInformativo3.isCurrentlyVisible(),is(false));
    }
    public void form_con_errores3(){
        assertThat(globoInformativo3.isCurrentlyVisible(), is(true));
    }

}


