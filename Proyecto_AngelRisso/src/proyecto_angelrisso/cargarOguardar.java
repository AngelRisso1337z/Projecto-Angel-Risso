/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_angelrisso;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author HP_AMD_64
 */
public class cargarOguardar {

    private File file=null;
    private JLabel cosa;
    private ArrayList<JLabel>label=new ArrayList();
    
    
    public cargarOguardar(String path) {
        this.file=new File(path);
    }

    public cargarOguardar() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public JLabel getCosa() {
        return cosa;
    }

    public void setCosa(JLabel cosa) {
        this.cosa = cosa;
    }

    public ArrayList<JLabel> getLabel() {
        return label;
    }

    public void setLabel(ArrayList<JLabel> label) {
        this.label = label;
    }

    public void cargar() {
        try {
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                try {
                    while ((cosa=(JLabel)ois.readObject())!=null) {
                        label.add(cosa);
                    }
                } catch (Exception e) {
                }
                ois.close();
                fis.close();
            }
        } catch (Exception e) {
        }
    }
    
}
