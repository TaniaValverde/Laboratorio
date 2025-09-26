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
public class Administrador extends Employee{
    
    private String idAdmin;
    private double bonus;

    public Administrador(String idAdmin, double bonus, String idEmpleado, Puesto puesto, String fechaEntrada, String fechaSalida, Estado estado, boolean disability, int height, int weight, Date birthday, String email, String id, String name, String phoneNumber) {
        super(idEmpleado, puesto, fechaEntrada, fechaSalida, estado, disability, height, weight, birthday, email, id, name, phoneNumber);
        this.idAdmin = idAdmin;
        this.bonus = bonus;
    }

    /**
     * @return the idAdmin
     */
    public String getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", bonus=" + bonus + '}';
    }
    
    
    
    
    
}
