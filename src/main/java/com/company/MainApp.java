package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*created on 15 Aug 2017*/

public class MainApp extends Application {



    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Parent rootNode = new FXMLLoader().load(getClass().getResourceAsStream("/layouts/Home.fxml")); //if you use this line make sure the fxml file name starts with a Capital letter else you will get null pointer exceptions at run time
        Parent  rootNode = FXMLLoader.load(getClass().getResource("/layouts/home.fxml")); //  if you use this line then it wont matter if the fxml file name starts with a small or capital letter

        Scene scene = new Scene(rootNode, 700, 200);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Hello JavaFX and Maven with Gradle Template");
        stage.setScene(scene);
        stage.show();
    }
}
