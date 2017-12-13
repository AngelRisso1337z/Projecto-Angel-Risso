/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_angelrisso;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author HP_AMD_64
 */
public class umlcargar implements Serializable {

    ArrayList<clases> clases = new ArrayList();
    File file = null;

    public umlcargar(String path) {
        file = new File(path);
    }

    public ArrayList<clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<clases> clases) {
        this.clases = clases;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void cargarArchivo() {
        try {

            clases c;
            if (file.exists()) {
                FileInputStream entrada = new FileInputStream(file);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((c = (clases) objeto.readObject()) != null) {
                        clases.add(c);
                    }
                } catch (EOFException ex) {
                    //encontro el final del archivo

                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            //encontro el final del archivo
        }

    }

    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(file);
            bw = new ObjectOutputStream(fw);
            for (clases c : clases) {
                bw.writeObject(c);
            }
            bw.flush();
        } catch (Exception ex) {

        }
        bw.close();
        fw.close();

    }
}
