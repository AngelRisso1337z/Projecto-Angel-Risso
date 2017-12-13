/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_angelrisso;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP_AMD_64
 */
public class clases {

    ArrayList<JLabel> lista = new ArrayList();
    JPanel clase;

    public clases() {
    }

    public clases(JPanel clase) {
        this.clase = clase;
    }

    public JPanel getClase() {
        return clase;
    }

    public void setClase(JPanel clase) {
        this.clase = clase;
    }

    public ArrayList<JLabel> getLista() {
        return lista;
    }

    public void setLista(ArrayList<JLabel> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return lista.get(0).getText();
    }

}
