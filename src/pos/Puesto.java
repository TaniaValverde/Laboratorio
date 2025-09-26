/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author pablonoguera
 */
class Puesto {

    private String idPuesto;
    private String nombrePuesto;
    private Horario horario;
    private double costoHora;
    private String tipoContrato;
    private String necesidad;
    private String responsabilidad;

    public Puesto(String idPuesto, String nombrePuesto, Horario horario, double costoHora, String tipoContrato, String necesidad, String responsabilidad) {
        this.idPuesto = idPuesto;
        this.nombrePuesto = nombrePuesto;
        this.horario = horario;
        this.costoHora = costoHora;
        this.tipoContrato = tipoContrato;
        this.necesidad = necesidad;
        this.responsabilidad = responsabilidad;
    }

    /**
     * @return the idPuesto
     */
    public String getIdPuesto() {
        return idPuesto;
    }

    /**
     * @param idPuesto the idPuesto to set
     */
    public void setIdPuesto(String idPuesto) {
        this.idPuesto = idPuesto;
    }

    /**
     * @return the nombrePuesto
     */
    public String getNombrePuesto() {
        return nombrePuesto;
    }

    /**
     * @param nombrePuesto the nombrePuesto to set
     */
    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    /**
     * @return the horario
     */
    public Horario getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    /**
     * @return the costoHora
     */
    public double getCostoHora() {
        return costoHora;
    }

    /**
     * @param costoHora the costoHora to set
     */
    public void setCostoHora(double costoHora) {
        this.costoHora = costoHora;
    }

    /**
     * @return the tipoContrato
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * @param tipoContrato the tipoContrato to set
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * @return the necesidad
     */
    public String getNecesidad() {
        return necesidad;
    }

    /**
     * @param necesidad the necesidad to set
     */
    public void setNecesidad(String necesidad) {
        this.necesidad = necesidad;
    }

    /**
     * @return the responsabilidad
     */
    public String getResponsabilidad() {
        return responsabilidad;
    }

    /**
     * @param responsabilidad the responsabilidad to set
     */
    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    @Override
    public String toString() {
        return "Puesto{" + "idPuesto=" + idPuesto + ", nombrePuesto=" + nombrePuesto + ", horario=" + horario + ", costoHora=" + costoHora + ", tipoContrato=" + tipoContrato + ", necesidad=" + necesidad + ", responsabilidad=" + responsabilidad + '}';
    }

}
