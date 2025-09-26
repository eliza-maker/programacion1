package model;

import java.util.ArrayList;

public class Propietario  {
    private String nombres;
    private String apellidos;
    private String id;
    private String telefono;
    private String direccion;

    public Propietario(String nombres, String apellidos, String id, String telefono, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }



    @Override
    public String toString() {
        return "Propietario{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id='" + id + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
