/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seia;

<<<<<<< HEAD
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
=======
>>>>>>> Gamaliel_T
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
/**
 *
 * @author Gama
 */
public class Seia extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Background.fxml"));       
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
<<<<<<< HEAD
        subidArchivo file = new subidArchivo();
        file.btnAbrirarchivoActionPerformed();
=======
>>>>>>> Gamaliel_T
        launch(args);
    }
    
}
