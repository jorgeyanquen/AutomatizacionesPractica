package com.practicauno.Step;

import com.practicauno.pages.ColorlibLoginPage;
import com.practicauno.pages.ColorlibMenuPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class PopupValidationSteps {

    ColorlibLoginPage colorlibLoginPage;
    ColorlibMenuPage colorlibMenuPage;

    @Step
    public void login_colorlib(String strUsuario, String strPass){
        //a. abrir navegador con la url de prueba
        colorlibLoginPage.open();
        //b. Ingresar usuario demo
        //c. Ingresar password demo
        //d. Click en boton Sing in */
        colorlibLoginPage.IngresarDatos(strUsuario, strPass);
        //e. verificar la autenticacion (label en home)
        colorlibLoginPage.verificaHome();


    }

    @Step
    public void ingresar_form_validation(){
        colorlibMenuPage.menuFormValidation();

    }
}
