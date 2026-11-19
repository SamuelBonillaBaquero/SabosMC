package com.sabosmc.Views;

import com.sabosmc.Controllers.LanguageController;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class ChooseLanguaje {

    private Label title = new Label();
    private Label subtitle = new Label();
    private Button continuee = new Button();
    private Label text = new Label();
    private RadioButton es = new RadioButton();
    private RadioButton en = new RadioButton();

    public Scene Scene1() {

        // ---------- ARRIBA: título (sin banner) ----------
        title.setText("SabosMC");
        title.getStyleClass().add("title");

        subtitle.setText("Server automation installer");
        subtitle.getStyleClass().add("subtitle");

        VBox cabecera = new VBox(4, title, subtitle);
        cabecera.setAlignment(Pos.CENTER);
        cabecera.setPadding(new Insets(40, 0, 10, 0));

 
        text.setText("Choose a language for the installation:");
        text.getStyleClass().add("section-label");

        ToggleGroup grupe = new ToggleGroup();

        es.setText("es");
        es.setToggleGroup(grupe);

        en.setText("en");
        en.setToggleGroup(grupe);
        en.setSelected(true);

        VBox centro = new VBox(15, text, es, en);
        centro.setAlignment(Pos.TOP_LEFT);
        centro.setPadding(new Insets(30, 0, 0, 150));

        // ---------- ABAJO: botón Continue (más arriba) ----------
        continuee.setText("Continue");
        continuee.setPrefSize(185, 45);
        continuee.getStyleClass().add("primary-button");
        continuee.setOnAction(e ->LanguageController.Continuar());

        HBox abajo = new HBox(continuee);
        abajo.setAlignment(Pos.CENTER);
        abajo.setPadding(new Insets(0, 0, 70, 0)); 

        // ---------- Layout principal ----------
        BorderPane raiz = new BorderPane();
        raiz.setTop(cabecera);
        raiz.setCenter(centro);
        raiz.setBottom(abajo);

        Scene escena = new Scene(raiz, 800, 500);
        escena.getStylesheets().add(
                getClass().getResource("/styles/installer.css").toExternalForm()
        );

        return escena;
    }
}