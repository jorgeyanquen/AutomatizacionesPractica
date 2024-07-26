package com.practicauno.Step;

import com.practicauno.pages.ColorlibFormValidationPage2;
import com.practicauno.pages.ColorlibFormValidationPage3;

import java.util.List;

public class colorlibFormValidationStep3 {

    ColorlibFormValidationPage3 colorlibFormValidationPage3;

    public void diligenciar_block_datos_tabla3(List<List<String>> data, int id){
        colorlibFormValidationPage3.Required(data.get(id).get(0).trim());
        colorlibFormValidationPage3.Email(data.get(id).get(1).trim());
        colorlibFormValidationPage3.Password1(data.get(id).get(2).trim());
        colorlibFormValidationPage3.Password2(data.get(id).get(3).trim());
        colorlibFormValidationPage3.Date(data.get(id).get(4).trim());
        colorlibFormValidationPage3.Url(data.get(id).get(5).trim());
        colorlibFormValidationPage3.seleccion();
        colorlibFormValidationPage3.Minichar(data.get(id).get(6).trim());
        colorlibFormValidationPage3.Maxichar(data.get(id).get(7).trim());
        colorlibFormValidationPage3.Min(data.get(id).get(8).trim());
        colorlibFormValidationPage3.Max(data.get(id).get(9).trim());
        colorlibFormValidationPage3.validate();


    }

    public void verificar_ingreso_datos_formulario_exitoso3(){
        colorlibFormValidationPage3.form_sin_errores3();
    }

    public void verificar_ingreso_datos_formulario_con_errores3(){
        colorlibFormValidationPage3.form_con_errores3();
    }
}
