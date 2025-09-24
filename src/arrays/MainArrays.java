/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author pablonoguera
 */
public class MainArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 2;
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {

            int randon = (int) (Math.random() * 100);

            vector[i] = randon;

        }

        int[] menorMayor = menorMayor(vector);
        System.out.println(menorMayor.length);
        if (menorMayor != null && menorMayor.length > 1) {
            System.out.println("Mayor: " + menorMayor[0]);
            System.out.println("Menor: " + menorMayor[1]);
        } else {
            System.out.println("Vector No valido, tamanno menor al requerido");
        }
    }

    public static int[] menorMayor(int[] numeros) {
        int[] menorMayor = new int[2];
        if (numeros.length == 0) {
            System.out.println("Vector vacio");
            return null;
        }

        if (numeros.length == 1) {
            System.out.println("El tamanno no es suficiente para comparar");
            return numeros;
        }
        if (numeros.length == 2) {

            if (numeros[0] > numeros[1]) {
                menorMayor[0] = numeros[0];
                menorMayor[1] = numeros[1];
                return menorMayor;
            } else {

                menorMayor[1] = numeros[0];
                menorMayor[0] = numeros[1];
                return menorMayor;
            }
        }
 
        
        
         
        return numeros;
    }

}
