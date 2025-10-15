package model;

import java.time.LocalDate;

public class ProductoAlimenticio extends Producto{
    protected LocalDate fechaVencimiento;

    public ProductoAlimenticio(String codigo, String nombre, double precioUnidad, LocalDate fechaVencimiento) {
        super(codigo, nombre, precioUnidad);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "ProductoAlimenticio{" +
                "fechaVencimiento=" + fechaVencimiento +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnidad=" + precioUnidad +
                '}';
    }
}
