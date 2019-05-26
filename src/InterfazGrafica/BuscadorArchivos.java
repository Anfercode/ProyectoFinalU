/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author andres
 */
public class BuscadorArchivos extends JFrame {

    public File ObtenerArchivo() {
        JFileChooser SelectorArchivos = new JFileChooser();
        SelectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int Resultado = SelectorArchivos.showOpenDialog(this);
        if (Resultado == JFileChooser.CANCEL_OPTION) {
            System.exit(1);
        }

        File NombreArchivo = SelectorArchivos.getSelectedFile();

        if ((NombreArchivo == null) || (NombreArchivo.getName().equals(""))) {
            JOptionPane.showMessageDialog(this, "Nombre Archivo Invalido", "Nombre Archivo Invalido", JOptionPane.ERROR_MESSAGE);
            System.exit(1);

        }

        return NombreArchivo;

    }

}
