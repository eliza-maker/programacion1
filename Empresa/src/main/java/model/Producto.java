package model;

public abstract class Producto {
    protected String codigo;
    protected String nombre;
    protected double precioUnidad;

    public Producto(String codigo, String nombre, double precioUnidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnidad=" + precioUnidad +
                '}';
    }
}
