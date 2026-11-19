package com.sabosmc.managers;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    
    private static Stage stage;


    public static void init(Stage c) {
        stage = c;
    }

    public static void goTo(Scene escena){
        stage.setScene(escena);
    }

    public static Stage getStage(){
        return stage;
    }


}
