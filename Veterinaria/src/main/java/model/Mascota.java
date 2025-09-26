package model;

import java.util.Arrays;

public class Mascota{
    private String codigo;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String color;
    private String peso;
    private String[] enfermedades;

    public Mascota(String codigo, String nombre, String especie, String raza, int edad, String color, String peso, String[] enfermedades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.enfermedades = enfermedades;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String[] getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String[] enfermedades) {
        this.enfermedades = enfermedades;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", peso='" + peso + '\'' +
                ", enfermedades=" + Arrays.toString(enfermedades) +
                '}';
    }
}
