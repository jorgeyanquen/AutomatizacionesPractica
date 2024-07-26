package com.practicauno.definitions;

import com.practicauno.Step.PopupValidationSteps;
import com.practicauno.Step.colorlibFormValidationSteps;
import com.practicauno.Step.colorlibFormValidationSteps2;
import com.practicauno.Step.colorlibFormValidationStep3;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PopupValidationDefinition {

    @Steps
    PopupValidationSteps popupValidationSteps;
    @Steps
    colorlibFormValidationSteps colorlibFormValidationSteps;

    @Steps
    colorlibFormValidationSteps2 colorlibFormValidationSteps2;

    @Steps
    colorlibFormValidationStep3 colorlibFormValidationStep3;




    @Given("Authentic in colorlib with user {string} and password {string}")
    public void authentic_in_colorlib_with_user_and_password(String Usuario, String Clave) {
        popupValidationSteps.login_colorlib(Usuario,Clave);

      }
    @Given("Entering the Form Validation functionality")
    public void entering_the_form_validation_functionality() {
        popupValidationSteps.ingresar_form_validation();
    }
    @When("Popup Validation Form Filling")
    public void popup_validation_form_filling(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            colorlibFormValidationSteps.diligenciar_popup_datos_tabla(cells, i);
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){}
        }
    }

    @When("block Validation Form Filling")
    public void block_validation_form_filling(DataTable dtDatosForm2) {
        List<List<String>> cells = dtDatosForm2.cells();

        for(int i=1; i<cells.size(); i++){

            colorlibFormValidationSteps2.diligenciar_block_datos_tabla2(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){}
        }
    }

    @When("Inline Validation Form Filling")
    public void inline_validation_form_filling(DataTable dtDatosForm3) {
        List<List<String>> cells = dtDatosForm3.cells();

        for(int i=1; i< cells.size(); i++){

            colorlibFormValidationStep3.diligenciar_block_datos_tabla3(cells, i);
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){

            }

        }
    }


    @Then("I verify successful entry")
    public void i_verify_successful_entry() {
        colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
     //   colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_exitoso2();
    }
    @Then("verify that the Validation Information Balloon is presented")
    public void verify_that_the_validation_information_balloon_is_presented() {
        colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
     //   colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_con_errores2();
    }

    @Then("I verify successful entry true")
    public void i_verify_successful_entry_true() {
        //colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
        colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_exitoso2();
    }
    @Then("verify that the Validation Information Balloon is presented false")
    public void verify_that_the_validation_information_balloon_is_presented_false() {
        //colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
        colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_con_errores2();
    }
    @Then("I verify successful entry Inline")
    public void i_verify_successful_entry_Inline() {
        //colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
     //   colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_exitoso2();
       colorlibFormValidationStep3.verificar_ingreso_datos_formulario_exitoso3();
    }

    @Then("verify that the Validation Information Balloon is presented Inline")
    public void verify_that_the_validation_information_balloon_is_presented_Inline() {
        //colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
      //  colorlibFormValidationSteps2.verificar_ingreso_datos_formulario_con_errores2();
       colorlibFormValidationStep3.verificar_ingreso_datos_formulario_con_errores3();
    }

}
