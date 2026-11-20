package com.sabosmc.services;

import java.util.Locale;
import java.util.ResourceBundle;

import javafx.scene.control.RadioButton;

public class i18n {
    
    private static ResourceBundle messages;

    public static void LoadLanguage(RadioButton languageChoose){


        Locale currentLocale= new Locale.Builder().setLanguage(languageChoose.getText()).build();

        messages= ResourceBundle.getBundle("i18n.messages", currentLocale);

    }


     public static String get(String clave) {
        return messages.getString(clave);
    }


}
