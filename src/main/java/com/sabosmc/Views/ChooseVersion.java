package com.sabosmc.Views;

import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class ChooseVersion {
    
    private Label name = new Label();
    private Button continuee = new Button();
    private ComboBox Choose = new ComboBox<>();



    public Scene scene2(){

        name.setText("SabosMC");


        BorderPane raiz = new BorderPane();
        raiz.setTop(name);
        
        Scene escena = new Scene(raiz,800,500);


        return escena;
        
    }


}
