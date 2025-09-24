/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

/**
 *
 * @author pablonoguera
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        matriz = llenarMatriz(matriz);
        mostrarMatriz(matriz);
//        int sumaDiagPrimaria = sumaDiagonalPrimaria(matriz);
//        System.out.println("sumaDiagPrimaria = " + sumaDiagPrimaria);
//        int sumaDiagSecundaria = sumaDiagonalSecundaria(matriz);
//        System.out.println("sumaDiagSecundaria = " + sumaDiagSecundaria);

        int clasificacion[] = clasificarEstaturas(matriz); // 0-130: no se puede montar 131 - 150 : juegos tipo A y si es > Todos los juegos
        System.out.println("0-130: no se puede montar : " + clasificacion[0]);
        System.out.println("131 - 160 : juegos tipo A : " + clasificacion[1]);
        System.out.println("Todos los juegos: " + clasificacion[2]);
    }

    private static int[][] llenarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 240);
            }
        }
        return matriz;
    }

    private static void mostrarMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }

    }

    /**
     * Suma la diagonal primaria que se entiende que incia en la posicion 0,0 y
     * termina en la posicion 3,3
     *
     * @param matriz entero con los edades de las personas
     * @return la sumatoria de la diagonal
     */
    private static int sumaDiagonalPrimaria(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    resultado += matriz[i][j];
                }
            }
        }
        return resultado;

    }

    private static int sumaDiagonalSecundaria(int[][] matriz) {
        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    resultado += matriz[i][j];
                }
            }
        }
        return resultado;

    }

    private static int[] clasificarEstaturas(int[][] matriz) {

        int clasificacion[] = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] <= 130) {

                    clasificacion[0] = clasificacion[0] + 1;

                } else if (matriz[i][j] > 130 && matriz[i][j] < 160) {

                    clasificacion[1] = clasificacion[1] + 1;

                } else {
                    clasificacion[2] = clasificacion[2] + 1;

                }

            }
        }
        return clasificacion;

    }

}
