/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

import java.util.Date;

/**
 *
 * @author pablonoguera
 */
public class Cajero extends Employee {

    private String idCajero;
    private double cajaChica;

    public Cajero(String idCajero, double cajaChica,
            String idEmpleado, Puesto puesto, String fechaEntrada,
            String fechaSalida, Estado estado, boolean disability,
            int height, int weight, Date birthday, String email,
            String id, String name, String phoneNumber) {
        super(idEmpleado, puesto, fechaEntrada,
                fechaSalida, estado, disability,
                height, weight, birthday, email,
                id, name, phoneNumber);
        this.idCajero = idCajero;
        this.cajaChica = cajaChica;
    }

    /**
     * @return the idCajero
     */
    public String getIdCajero() {
        return idCajero;
    }

    /**
     * @param idCajero the idCajero to set
     */
    public void setIdCajero(String idCajero) {
        this.idCajero = idCajero;
    }

    /**
     * @return the cajaChica
     */
    public double getCajaChica() {
        return cajaChica;
    }

    /**
     * @param cajaChica the cajaChica to set
     */
    public void setCajaChica(double cajaChica) {
        this.cajaChica = cajaChica;
    }

    @Override
    public String toString() {
        return super.toString() + "Cajero{" + "idCajero=" + idCajero + ", cajaChica=" + cajaChica + '}';
    }

}
