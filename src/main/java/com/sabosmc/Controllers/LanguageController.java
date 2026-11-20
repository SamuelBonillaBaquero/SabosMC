package com.sabosmc.Controllers;

import com.sabosmc.Views.ChooseVersion;
import com.sabosmc.managers.SceneManager;
import com.sabosmc.services.i18n;

import javafx.scene.control.RadioButton;


public class LanguageController {
    


    public static void Continuar(RadioButton choose){


        i18n.LoadLanguage(choose); //carga la confguracion del idioma 


        ChooseVersion next = new ChooseVersion();

        SceneManager.goTo(next.scene2());

    }



}
