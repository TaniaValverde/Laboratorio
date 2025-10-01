/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import clase1.Person;
import java.util.Date;

/**
 *
 * @author pablonoguera
 */
public class Employee extends Person {
    
    private String idEmpleado;
    private Puesto puesto;
    private String fechaEntrada;
    private String fechaSalida;
    private String [] despido = new  String[3];
    private Estado estado;

    public Employee(String idEmpleado, Puesto puesto, String fechaEntrada, 
                    String fechaSalida, Estado estado,
            boolean disability, int height, int weight, Date birthday, 
            String email, String id, String name, String phoneNumber) {
        super(disability, height, weight, birthday, email, id, name, 
                phoneNumber);
        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    /**
     * @return the idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the puesto
     */
    public Puesto getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the fechaEntrada
     */
    public String getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * @param fechaEntrada the fechaEntrada to set
     */
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the despido
     */
    public String[] getDespido() {
        return despido;
    }

    /**
     * @param despido the despido to set
     */
    public void setDespido(String[] despido) {
        this.despido = despido;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    } 

    @Override
    public String toString() {
        return super.toString() + "Employee{" + "idEmpleado=" + idEmpleado + ", puesto=" + puesto + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", despido=" + despido + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
}
