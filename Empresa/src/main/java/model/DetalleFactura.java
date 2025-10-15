package model;

public class DetalleFactura {
    private int cantidadCompra;
    private Producto producto;
    private double subTotal;

    public DetalleFactura(int cantidadCompra, Producto producto) {

        this.cantidadCompra = cantidadCompra;
        this.producto = producto;
        this.subTotal = calcularSubTotal();
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double calcularSubTotal(){
        return  cantidadCompra*producto.getPrecioUnidad();
    }

    @Override
    public String toString() {
        return "DetalleFactura{" +
                "cantidadCompra=" + cantidadCompra +
                ", producto=" + producto +
                ", subTotal=" + subTotal +
                '}';
    }
}
