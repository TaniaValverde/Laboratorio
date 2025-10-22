/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package files;

import javax.swing.*;
import java.io.*;
import javax.swing.JFileChooser;

/**
 *
 * @author pablonoguera
 */
public class TSEPadronElectoral {

    public static void main(String[] args) {
        
        Votante [] listaVotantes = new  Votante[25694];// para Golfito
        // Crear un selector de archivos
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione el archivo del padrón electoral");

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + archivo.getAbsolutePath());

            try ( BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea = "";
                int contador = 0;
                
                while ((linea = br.readLine()) != null) { // Leer línea por línea
                    
                    
                    String partes[] = linea.split(",");
                    Votante votante =new  Votante(partes[0], 
                            partes[1], 
                            partes[2], 
                            partes[3], 
                            partes[4],
                            partes[5],
                            partes[6]);
                    
                    listaVotantes[contador]=votante;
                    contador++;
                }

                System.out.println("Total de líneas leídas: " + listaVotantes.length);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        "Error al leer el archivo: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else {
            System.out.println("No se seleccionó ningún archivo.");
        }
    }
}
