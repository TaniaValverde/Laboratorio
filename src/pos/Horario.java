/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos;

/**
 *
 * @author pablonoguera
 */
class Horario {
    
    private String idHorario;
    private String tipo;
    private String horarioComida;
    private String horaEntrada;
    private String horaSalida;
    private DiasLaborables diasLaborables;

    public Horario(String idHorario, String tipo, String horarioComida, String horaEntrada, String horaSalida, DiasLaborables diasLaborables) {
        this.idHorario = idHorario;
        this.tipo = tipo;
        this.horarioComida = horarioComida;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.diasLaborables = diasLaborables;
    }

    /**
     * @return the idHorario
     */
    public String getIdHorario() {
        return idHorario;
    }

    /**
     * @param idHorario the idHorario to set
     */
    public void setIdHorario(String idHorario) {
        this.idHorario = idHorario;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the horarioComida
     */
    public String getHorarioComida() {
        return horarioComida;
    }

    /**
     * @param horarioComida the horarioComida to set
     */
    public void setHorarioComida(String horarioComida) {
        this.horarioComida = horarioComida;
    }

    /**
     * @return the horaEntrada
     */
    public String getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSalida
     */
    public String getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the diasLaborables
     */
    public DiasLaborables getDiasLaborables() {
        return diasLaborables;
    }

    /**
     * @param diasLaborables the diasLaborables to set
     */
    public void setDiasLaborables(DiasLaborables diasLaborables) {
        this.diasLaborables = diasLaborables;
    }

    @Override
    public String toString() {
        return "Horario{" + "idHorario=" + idHorario + ", tipo=" + tipo + ", horarioComida=" + horarioComida + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", diasLaborables=" + diasLaborables + '}';
    }
    
    
    
    
}
