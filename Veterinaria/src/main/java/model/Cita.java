package model;

import java.time.LocalDate;

public class Cita {
    private String codigo;
    private LocalDate fecha;
    private String hora;
    private double costo;
    private String observaciones;
    private String estado;
    private double duracion;

    public Cita(String codigo, LocalDate fecha, String hora, double costo, String observaciones, String estado, double duracion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.costo = costo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.duracion = duracion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", hora='" + hora + '\'' +
                ", costo=" + costo +
                ", observaciones='" + observaciones + '\'' +
                ", estado='" + estado + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
