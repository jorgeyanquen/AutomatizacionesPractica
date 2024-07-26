package com.practicauno.Step;

import com.practicauno.pages.ColorlibFormValidationPage2;

import com.practicauno.pages.ColorlibFormValidationPage;

import java.util.List;

public class colorlibFormValidationSteps2 {


    ColorlibFormValidationPage2 colorlibFormValidationPage2;


    public void diligenciar_block_datos_tabla2(List<List<String>> data, int id){
        colorlibFormValidationPage2.Required(data.get(id).get(0).trim());
        colorlibFormValidationPage2.Email(data.get(id).get(1).trim());
        colorlibFormValidationPage2.Password1(data.get(id).get(2).trim());
        colorlibFormValidationPage2.Password2(data.get(id).get(3).trim());
        colorlibFormValidationPage2.Date(data.get(id).get(4).trim());
        colorlibFormValidationPage2.Url(data.get(id).get(5).trim());
        colorlibFormValidationPage2.Digital(data.get(id).get(6).trim());
        colorlibFormValidationPage2.Range(data.get(id).get(7).trim());
        colorlibFormValidationPage2.seleccion();
        colorlibFormValidationPage2.validate();



    }


    public void verificar_ingreso_datos_formulario_exitoso2(){
        colorlibFormValidationPage2.form_sin_errores2();
    }

    public void verificar_ingreso_datos_formulario_con_errores2(){
        colorlibFormValidationPage2.form_con_errores2();
    }
}
