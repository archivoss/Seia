/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seia;

import java.awt.BasicStroke;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author Gama
 */
public class BackgroundController implements Initializable {
    Rectangle rec;
    File archivoSeleccionado;
    JFileChooser seleccionarArchivo;

    @FXML
    private Button addFileButton;
    
    @FXML
    private Pane drawPane;
    
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private TextArea contenidoPDF;
    
    @FXML
    private Button drawButton;
    
    @FXML
    private void addFileButtonAction(ActionEvent event) throws IOException {
        seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.showOpenDialog(null);
        archivoSeleccionado = seleccionarArchivo.getSelectedFile(); 
        LeerPdf pdfTextParserObj = new LeerPdf();
        String pdfToText = pdfTextParserObj.pdftoText(archivoSeleccionado);
        String[] cualquierwea = pdfToText.split("\n");
        char[] caracteres;
        caracteres = cualquierwea[0].toCharArray();
        System.out.println(caracteres.length);
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i]);
        }
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
        drawPane.getChildren().add(rec);
    }
    
    @FXML
    private void drawDragged(MouseEvent event) { 
        rec.setWidth(event.getX() - rec.getX());
        rec.setHeight(event.getY() - rec.getY());    
        contenidoPDF.selectRange((int) (Math.round((rec.getX()) - 15)/ 14.3), (int) (Math.round((event.getX()) - 15)/ 14.3));
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
