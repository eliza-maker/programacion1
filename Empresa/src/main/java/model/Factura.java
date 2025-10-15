package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String codigo;
    private LocalDate fecha;
    private double total;
    private Cliente cliente;
    private List<DetalleFactura>listaDetalles;

    public Factura(String codigo, LocalDate fecha, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.listaDetalles = new ArrayList<>();
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<DetalleFactura> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(List<DetalleFactura> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public void agregarDetalle(int cantidadCompra, Producto producto){
        DetalleFactura detalle= new DetalleFactura(cantidadCompra, producto);
        listaDetalles.add(detalle);
    }

    public double calcularTotal(){
        double subtotal = 0.0;

        for (DetalleFactura detalle : listaDetalles) {
            subtotal += detalle.calcularSubTotal();
        }
        double descuento = cliente.calcularDescuento(subtotal);
        total = subtotal - descuento;

        return total;
    }

    public void mostrarFactura() {
        System.out.println("======================================");
        System.out.println("Factura N°: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println(cliente);
        System.out.println("--------------------------------------");
        System.out.println("DETALLES:");
        for (DetalleFactura detalle : listaDetalles) {
            System.out.println(detalle);
        }
        System.out.println("--------------------------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("======================================");
    }
}


