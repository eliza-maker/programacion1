package model;

public class ProductoElectrodomestico extends Producto {
    protected int garantia;

    public ProductoElectrodomestico(String codigo, String nombre, double precioUnidad, int garantia) {
        super(codigo, nombre, precioUnidad);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "ProductoElectrodomestico{" +
                "garantia=" + garantia +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnidad=" + precioUnidad +
                '}';
    }
}
