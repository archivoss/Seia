/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seia;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author nestor
 */
public class subidArchivo {
    File archivo;
    
    public File getArchivo(String archivo){

        try {
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);
            return objetofile;

        }catch (IOException ex) {
            System.out.println(ex);
        }
        return null;

    } 
    
    public void btnAbrirarchivoActionPerformed() {                                                
        
        archivo = getArchivo("C:\\Users\\nesto\\Desktop\\archivo.pdf");
        if (archivo != null){
            archivo.getName();
        }
    } 
}
