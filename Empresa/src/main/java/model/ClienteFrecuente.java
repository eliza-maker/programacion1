package model;

public class ClienteFrecuente extends Cliente {
    protected int porcentFidelidad;
    protected double porcentDescuento=0.05;

    public ClienteFrecuente(String nombre, String cedula, String direccion, int porcentFidelidad, double porcentDescuento) {
        super(nombre, cedula, direccion);
        this.porcentFidelidad = porcentFidelidad;
        this.porcentDescuento = porcentDescuento;
    }

    public int getPorcentFidelidad() {
        return porcentFidelidad;
    }

    public void setPorcentFidelidad(int porcentFidelidad) {
        this.porcentFidelidad = porcentFidelidad;
    }

    public double getPorcentDescuento() {
        return porcentDescuento;
    }

    public void setPorcentDescuento(double porcentDescuento) {
        this.porcentDescuento = porcentDescuento;
    }

    @Override
    public double calcularDescuento(double total) {
        return porcentDescuento * total;
    }

    @Override
    public String toString() {
        return "ClienteFrecuente{" +
                "Puntos por fidelidad=" + porcentFidelidad +
                ", Porcentaje de descuento=" + porcentDescuento +
                '}';
    }
}
