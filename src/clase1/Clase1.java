/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

/**
 *Sistema de ventas de boletos de bus
 * @author pablonoguera
 */
public class Clase1 { 
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person maria=new Person();//Object w
        
        Person pedro=new Person(true, 180, 80000,null, "pedro@gmail.com",
                "6-389302389","Pedro Perez Rodirguez", "87238937");
        System.out.println(maria.toString());
        System.out.println("pedro = " + pedro.toString());
         
    }
    
}
