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
public class Conserje extends Employee{
   
    private String idConserje;

    public Conserje(String idConserje, String idEmpleado, Puesto puesto, String fechaEntrada, String fechaSalida, Estado estado, boolean disability, int height, int weight, Date birthday, String email, String id, String name, String phoneNumber) {
        super(idEmpleado, puesto, fechaEntrada, fechaSalida, estado, disability, height, weight, birthday, email, id, name, phoneNumber);
        this.idConserje = idConserje;
    }

    /**
     * @return the idConserje
     */
    public String getIdConserje() {
        return idConserje;
    }

    /**
     * @param idConserje the idConserje to set
     */
    public void setIdConserje(String idConserje) {
        this.idConserje = idConserje;
    }

    @Override
    public String toString() {
        return "Conserje{" + "idConserje=" + idConserje + '}';
    }
    
    
    
    
}
