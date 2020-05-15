
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seia;

import java.awt.BasicStroke;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;




public class BackgroundController implements Initializable {

    Rectangle rec;


    File archivoSeleccionado;
    JFileChooser seleccionarArchivo;

    @FXML
    private Button addFileButton;
    
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Label contenidoPDF;
    
    @FXML
    private Button drawButton;
    
    @FXML
    private void addFileButtonAction(ActionEvent event) throws IOException {
        seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.showOpenDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile(); 
        LeerPdf pdfTextParserObj = new LeerPdf();
        String pdfToText = pdfTextParserObj.pdftoText(archivoSeleccionado);
        contenidoPDF.setText(pdfToText);
    }
    
    @FXML
    private void drawButtonAction(ActionEvent event) {
    }
    
    @FXML
    private void drawPressed(MouseEvent event) {
        rec = new Rectangle();
        rec.setFill(Color.TRANSPARENT);
        rec.setStrokeWidth(2);
        rec.setStroke(Color.BLACK);
        rec.setX(event.getX());
        rec.setY(event.getY());
    }
    
    @FXML
    private void drawDragged(MouseEvent event) { 
        rec.setWidth(event.getX());
        rec.setHeight(event.getY());
        anchorPane.getChildren().addAll(rec);
    }
    
    @FXML
    private void enter(MouseEvent event){
        addFileButton.setStyle("-fx-background-color: #CCCCCC;");
    }
    
    @FXML
    private void release(MouseEvent event){
        addFileButton.setStyle("-fx-background-color: #FFFFFF;");
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


    }    
    
}
