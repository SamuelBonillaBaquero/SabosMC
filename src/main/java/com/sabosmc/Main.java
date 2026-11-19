package com.sabosmc;

import com.sabosmc.Views.ChooseLanguaje;
import com.sabosmc.managers.SceneManager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        
        //app main door 
        launch(args);

    }

     @Override
    public void start(Stage stage) throws Exception {
        
    ChooseLanguaje vistaIdioma = new ChooseLanguaje();

    Scene scene1 = vistaIdioma.Scene1();
    


    stage.setTitle("SabosMc Installer");
    stage.setScene(scene1);
    stage.show();


    SceneManager.init(stage);



        

    }

   
}