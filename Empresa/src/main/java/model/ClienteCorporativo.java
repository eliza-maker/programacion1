package model;

public class ClienteCorporativo extends Cliente {
    protected String nit;
    protected double porcentDescuento;

    public ClienteCorporativo(String nombre, String cedula, String direccion, String nit, double porcentDescuento) {
        super(nombre, cedula, direccion);
        this.nit = nit;
        this.porcentDescuento = porcentDescuento;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getPorcentDescuento() {
        return porcentDescuento;
    }

    public void setPorcentDescuento(double porcentDescuento) {
        this.porcentDescuento = porcentDescuento;
    }

    @Override
    public double calcularDescuento(double total) {
        return total*(porcentDescuento/100);
    }

    @Override
    public String toString() {
        return "ClienteCorporativo{" +
                "nit='" + nit + '\'' +
                ", porcentDescuento=" + porcentDescuento +
                '}';
    }
}
