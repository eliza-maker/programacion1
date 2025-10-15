package model;

public abstract class Cliente {
    protected String nombre;
    protected String cedula;
    protected String direccion;

    public Cliente(String nombre, String cedula, String direccion) {
        if(nombre==null||nombre.isEmpty()||cedula==null||cedula.isEmpty()){
            throw new IllegalArgumentException("El campo está vacio");
        }
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract double calcularDescuento(double total);

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
