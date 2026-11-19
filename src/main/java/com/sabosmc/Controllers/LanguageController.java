package com.sabosmc.Controllers;

import com.sabosmc.Views.ChooseVersion;
import com.sabosmc.managers.SceneManager;


public class LanguageController {
    


    public static void Continuar(){

        ChooseVersion next = new ChooseVersion();

        SceneManager.goTo(next.scene2());

    }



}
