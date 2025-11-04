/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

/**
 * Clase que representa un votante dentro del padrón electoral.
 * Contiene la información personal básica de cada persona registrada.
 * 
 * @author pablonoguera
 */
public class Votante {
    
   private String cedula;
   private String codPostal;
   private String fechaVencimiento;
   private String codElectoral;
   private String nombreCompleto;
   private String primerApellido;
   private String segundoApellido;

    /**
     * Crea un nuevo objeto {@code Votante} con todos los datos del padrón electoral.
     *
     * @param cedula número de identificación del votante
     * @param codPostal código postal correspondiente al votante
     * @param fechaVencimiento fecha de vencimiento de la cédula
     * @param codElectoral código del distrito electoral
     * @param nombreCompleto nombre completo del votante
     * @param primerApellido primer apellido del votante
     * @param segundoApellido segundo apellido del votante
     */
    public Votante(String cedula, String codPostal, String fechaVencimiento, 
            String codElectoral, String nombreCompleto, String primerApellido,
            String segundoApellido) {
        this.cedula = cedula;
        this.codPostal = codPostal;
        this.fechaVencimiento = fechaVencimiento;
        this.codElectoral = codElectoral;
        this.nombreCompleto = nombreCompleto;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return la cédula del votante
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula asigna el número de cédula del votante
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return el código postal del votante
     */
    public String getCodPostal() {
        return codPostal;
    }

    /**
     * @param codPostal asigna el código postal del votante
     */
    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    /**
     * @return la fecha de vencimiento del documento
     */
    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento asigna la fecha de vencimiento del documento
     */
    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @return el código electoral del votante
     */
    public String getCodElectoral() {
        return codElectoral;
    }

    /**
     * @param codElectoral asigna el código electoral del votante
     */
    public void setCodElectoral(String codElectoral) {
        this.codElectoral = codElectoral;
    }

    /**
     * @return el nombre completo del votante
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    /**
     * Devuelve el nombre completo del votante junto con sus apellidos.
     *
     * @return texto con cédula, nombre y apellidos del votante
     */
    public String getNombreCompletoApellidos() {
        return cedula + " " + nombreCompleto.trim() + " " 
                + primerApellido.trim() + " " + segundoApellido.trim();
    }

    /**
     * @param nombreCompleto asigna el nombre completo del votante
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return el primer apellido del votante
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido asigna el primer apellido del votante
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return el segundo apellido del votante
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido asigna el segundo apellido del votante
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String toString() {
        return "Votante{" + "cedula=" + cedula + ", codPostal=" + codPostal 
                + ", fechaVencimiento=" + fechaVencimiento + ", codElectoral=" 
                + codElectoral + ", nombreCompleto=" + nombreCompleto 
                + ", primerApellido=" + primerApellido + ", segundoApellido=" 
                + segundoApellido + '}';
    }
}
