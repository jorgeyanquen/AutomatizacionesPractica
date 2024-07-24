package com.practicauno.definitions;

import com.practicauno.Step.PopupValidationSteps;
import com.practicauno.Step.colorlibFormValidationSteps;
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

        }
    }
    @Then("I verify successful entry")
    public void i_verify_successful_entry() {
        colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
    }

}
