/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Gama
 */
public class BackgroundController implements Initializable {

    @FXML
    private Button addFileButton;
    
    @FXML
    private void enter(MouseEvent event){
        addFileButton.setStyle("-fx-background-color: #CCCCCC;");
    }
    
    @FXML
    private void release(MouseEvent event){
        addFileButton.setStyle("-fx-background-color: #CCCCCC;");
    }
    
    @FXML
    private void exit(MouseEvent event){
        addFileButton.setStyle("-fx-background-color: #FFFFFF;");
    }
    
    @FXML
    private void press(MouseEvent event){
        addFileButton.setStyle("-fx-background-color: #BBBBBB;");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
