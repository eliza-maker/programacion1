package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private String nombre;
    private String nit;
    private String direccion;
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;

    public Empresa(String nombre, String nit, String direccion) {
        if(nombre.isEmpty()||nit.isEmpty()||direccion.isEmpty()){
            throw new IllegalArgumentException("El campo está vacío");
        }

        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.listaClientes= new ArrayList<>();
        this.listaProductos= new ArrayList<>();
        this.listaFacturas= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    //Cliente

    public String ingresarCliente(Cliente cliente) {
        Optional<Cliente> existente = buscarCliente(cliente.getCedula());
        if (existente.isPresent()) {
            return "El cliente ya está registrado";
        } else {
            listaClientes.add(cliente);
            return "El cliente ha sido registrado exitosamente";
        }
    }

    public Optional<Cliente> buscarCliente(String cedula){
        return listaClientes.stream().filter(cliente -> cliente.getCedula().equals(cedula)).findFirst();
    }

    public String actualizarCliente(String nuevoNombre, String cedulaActual, String nuevaDireccion) {
        Optional<Cliente> clienteEncontrado = buscarCliente(cedulaActual);
        if (clienteEncontrado.isPresent()) {
            Cliente cliente = clienteEncontrado.get();
            cliente.setNombre(nuevoNombre);
            cliente.setDireccion(nuevaDireccion);
            return "La información del cliente se actualizó con éxito";
        } else {
            return "El cliente no está reistrado";
        }
    }
    public String eliminarCliente(String cedula) {
        Optional<Cliente> clienteEncontrado = buscarCliente(cedula);
        if (clienteEncontrado.isPresent()) {
            listaClientes.remove(clienteEncontrado.get());
            return "El cliente ha sido eliminado correctamente";
        } else {
            return "El cliente no está registrado";
        }
    }

    // Factura

    public String generarFactura(String codigo, Cliente cliente, ArrayList<DetalleFactura> detalles) {
        for (Factura factura : listaFacturas) {
            if (factura.getCodigo().equals(codigo) ) {
                return "Esta factura ya está registrada.";
            }
        }
        Factura factura = new Factura(codigo, java.time.LocalDate.now(), cliente);

        for (DetalleFactura detalle : detalles) {
            factura.agregarDetalle(detalle.getCantidadCompra(),detalle.getProducto());
        }
        factura.calcularTotal();
        listaFacturas.add(factura);

        return "La factura ha sido generada correctamente. Total: $" + factura.getTotal();
    }

    public Factura buscarFactura(String codigo) {
        for (Factura factura : listaFacturas) {
            if (factura.getCodigo().equals(codigo)) {
                return factura;
            }
        }
        return null;
    }
    public void mostrarFacturas() {
        if (listaFacturas.isEmpty()) {
            System.out.println("No hay facturas registradas.");
        } else {
            for (Factura factura : listaFacturas) {
                factura.mostrarFactura();
                System.out.println();
            }
        }
    }
    // Producto

    public String ingresarProducto(Producto producto) {
        Optional<Producto> existente = buscarProducto(producto.getCodigo());
        if (existente.isPresent()) {
            return "El producto ya esta registrado";
        } else {
            listaProductos.add(producto);
            return "El producto ha sido registrado exitosamente";
        }
    }

    public Optional<Producto> buscarProducto(String codigo) {
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                return Optional.of(producto);
            }
        }
        return Optional.empty();
    }

    public String actualizarProducto(String codigo, String nuevoNombre, double nuevoPrecio) {
        Optional<Producto> productoEncontrado = buscarProducto(codigo);
        if (productoEncontrado.isPresent()) {
            Producto producto = productoEncontrado.get();
            producto.setNombre(nuevoNombre);
            producto.setPrecioUnidad(nuevoPrecio);
            return "La información del producto se actualizó con éxito";
        } else {
            return "El producto no está reistrado";
        }
    }

    public String eliminarProducto(String codigo) {
        Optional<Producto> productoEncontrado = buscarProducto(codigo);
        if (productoEncontrado.isPresent()) {
            listaProductos.remove(productoEncontrado.get());
            return "El producto ha sido eliminado exitosamente";
        } else {
            return "El producto no está reistrado";
        }
    }



}
