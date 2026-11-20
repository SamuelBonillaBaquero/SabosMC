package com.sabosmc.managers;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    
    private static Stage stage;


    public static void init(Stage c) { //inicia la escena 0 en el start del main
        stage = c;
    }

    public static void goTo(Scene escena){ // el cambio de escena 
        stage.setScene(escena);
    }

    public static Stage getStage(){ //me devuelve el stage por si tengo que hacer algo con los componentes 
        return stage;
    }


}
