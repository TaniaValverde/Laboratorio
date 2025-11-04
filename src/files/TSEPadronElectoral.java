/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package files;

import javax.swing.*;
import java.io.*;
import javax.swing.JFileChooser;

/**
 * Clase principal que permite cargar y procesar un archivo del
 * padrón electoral del TSE. 
 * 
 * <p>Utiliza la clase {@link Votante} para representar cada registro
 * del padrón, y un {@link JFileChooser} para que el usuario seleccione
 * el archivo desde la interfaz gráfica.</p>
 * 
 * @author pablonoguera
 */
public class TSEPadronElectoral {

    /**
     * Método principal del programa. 
     * Permite seleccionar un archivo del padrón electoral, leer su contenido,
     * crear objetos {@code Votante} y almacenarlos en un arreglo.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        
        Votante[] listaVotantes = new Votante[25694]; // para Golfito
        
        // Crear un selector de archivos
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccione el archivo del padrón electoral");

        int seleccion = fileChooser.showOpenDialog(null);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            System.out.println("Archivo seleccionado: " + archivo.getAbsolutePath());

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String linea = "";
                int contador = 0;
                
                while ((linea = br.readLine()) != null) { // Leer línea por línea
                    
                    String partes[] = linea.split(",");
                    Votante votante = new Votante(
                            partes[0], 
                            partes[1], 
                            partes[2], 
                            partes[3], 
                            partes[4],
                            partes[5],
                            partes[6]
                    );
                    
                    listaVotantes[contador] = votante;
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
