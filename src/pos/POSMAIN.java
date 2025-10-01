/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 *
 * @author pablonoguera
 */
public class POSMAIN {
    
    static int c=0;

    private static void menu() throws IOException {
        int opc;
        do {
            System.out.println("\n=== MENÚ PLANILLA ===");
            System.out.println("1) Agregar Empleado");
            System.out.println("2) Mostrar Planilla");
            System.out.println("0) Salir");
            System.out.print("Seleccione una opción: ");
            opc = Integer.parseInt(br.readLine());

            switch (opc) {
               case 1 ->
                   planilla[c] = crearEmpleado();
                
                   
                case 2 ->
                    mostrarPlanilla();

                case 0 ->
                    System.out.println("Hasta luego!");
                default ->
                    System.out.println("Opción inválida.");
            }
        } while (opc != 0);
    }

    private static void mostrarPlanilla() {
        
        for (Employee planilla1 : planilla) {
            
            if (planilla1 instanceof Cajero c1) {
               
                System.out.println("Empleado: ");
                System.out.println(planilla1.toString());
                System.out.println("Cajero: ");
                System.out.println(c1.toString());
            }
            if (planilla1 instanceof Administrador a1) {
                System.out.println("Administrador: ");
                System.out.println(a1.toString());
            }
        }

    }

    static Employee[] planilla = new Employee[2];

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        menu();

    }

    private static Employee crearEmpleado() throws IOException {
        System.out.println("Modulo de crear empleados");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Conserje");
        System.out.println("4. regresar");
        int opc = Integer.parseInt(br.readLine());
        switch (opc) {
            case 1: {
                System.out.println("Ingrese el ID del Cajero:");
                String idCajero = br.readLine();

                System.out.println("Ingrese el monto de Caja Chica:");
                double cajaChica = Double.parseDouble(br.readLine());

                System.out.println("Ingrese el ID del Empleado:");
                String idEmpleado = br.readLine();

                System.out.println("Ingrese el puesto (ejemplo: CAJERO, ADMINISTRADOR):");
                Puesto puesto = null;

                System.out.println("Ingrese la fecha de entrada (yyyy-MM-dd):");
                String fechaEntrada = br.readLine();

                System.out.println("Ingrese la fecha de salida (yyyy-MM-dd):");
                String fechaSalida = br.readLine();

                System.out.println("Ingrese el estado (ejemplo: ACTIVO, INACTIVO):");
                Estado estado = Estado.ACTIVO;

                System.out.println("¿Tiene discapacidad? (true/false):");
                boolean disability = Boolean.parseBoolean(br.readLine());

                System.out.println("Ingrese la altura (en cm):");
                int height = Integer.parseInt(br.readLine());

                System.out.println("Ingrese el peso (en kg):");
                int weight = Integer.parseInt(br.readLine());

                System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd):");
                Date birthday = java.sql.Date.valueOf(br.readLine());

                System.out.println("Ingrese el email:");
                String email = br.readLine();

                System.out.println("Ingrese el ID (genérico de persona Cedula):");
                String id = br.readLine();

                System.out.println("Ingrese el nombre:");
                String name = br.readLine();

                System.out.println("Ingrese el número de teléfono:");
                String phoneNumber = br.readLine();

// Ahora instanciamos el objeto Cajero
                Cajero c1 = new Cajero(
                        idCajero,
                        cajaChica,
                        idEmpleado,
                        puesto,
                        fechaEntrada,
                        fechaSalida,
                        estado,
                        disability,
                        height,
                        weight,
                        birthday,
                        email,
                        id,
                        name,
                        phoneNumber
                );

                System.out.println("Cajero creado: " + c1.toString());
                c= c+1;
                return c1;

            }

            case 2: {
                System.out.println("Ingrese el ID del Administrador:");
                String idAdmin = br.readLine();

                System.out.println("Ingrese el bono del Administrador:");
                double bonus = Double.parseDouble(br.readLine());

                System.out.println("Ingrese el ID del Empleado:");
                String idEmpleado2 = br.readLine();

                System.out.println("Ingrese el puesto (ejemplo: ADMINISTRADOR, GERENTE):");
                Puesto puesto2 = null;

                System.out.println("Ingrese la fecha de entrada (yyyy-MM-dd):");
                String fechaEntrada2 = br.readLine();

                System.out.println("Ingrese la fecha de salida (yyyy-MM-dd):");
                String fechaSalida2 = br.readLine();

                System.out.println("Ingrese el estado (ejemplo: ACTIVO, INACTIVO):");
                Estado estado2 = Estado.ACTIVO;

                System.out.println("¿Tiene discapacidad? (true/false):");
                boolean disability2 = Boolean.parseBoolean(br.readLine());

                System.out.println("Ingrese la altura (en cm):");
                int height2 = Integer.parseInt(br.readLine());

                System.out.println("Ingrese el peso (en kg):");
                int weight2 = Integer.parseInt(br.readLine());

                System.out.println("Ingrese la fecha de nacimiento (yyyy-MM-dd):");
                Date birthday2 = java.sql.Date.valueOf(br.readLine());

                System.out.println("Ingrese el email:");
                String email2 = br.readLine();

                System.out.println("Ingrese el ID (genérico de persona):");
                String id2 = br.readLine();

                System.out.println("Ingrese el nombre:");
                String name2 = br.readLine();

                System.out.println("Ingrese el número de teléfono:");
                String phoneNumber2 = br.readLine();

// Creamos el objeto Administrador
                Administrador a1 = new Administrador(
                        idAdmin,
                        bonus,
                        idEmpleado2,
                        puesto2,
                        fechaEntrada2,
                        fechaSalida2,
                        estado2,
                        disability2,
                        height2,
                        weight2,
                        birthday2,
                        email2,
                        id2,
                        name2,
                        phoneNumber2
                );
                c= c+1;
                System.out.println("Administrador creado: " + a1);
                return a1;
            }
            default:
                System.out.println("No ha seleccionado un puesto");
        }
        return null;
    }

}
