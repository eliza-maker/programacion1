package model;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private Arraylist <Animal> listaAnimales;

    public Zoologico(String nombre, Arraylist<Animal> listaAnimales) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arraylist<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(Arraylist<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public void registrarAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println("Animal registrado: " + animal.getNombre());
    }


    public void mostrarAnimales() {
        System.out.println("Animales en el zoológico " + nombre + ":");
        for (Animal a : listaAnimales) {
            System.out.println("- " + a.getNombre());
        }
    }


    public void actualizarAnimal(int i, String nuevoNombre) {
        if (i >= 0 && i < listaAnimales.size()) {
            listaAnimales.get(i).setNombre(nuevoNombre);
            System.out.println("Animal actualizado en la posición " + i);
        } else {
            System.out.println("El animal no existe.");
        }
    }


    public void eliminarAnimal(int i) {
        if (i >= 0 && i < listaAnimales.size()) {
            Animal eliminado = listaAnimales.remove(i);
            System.out.println("Animal eliminado: " + eliminado.getNombre());
        } else {
            System.out.println("El animal no existe.");
        }
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nombre='" + nombre + '\'' +
                ", listaAnimales=" + listaAnimales +
                '}';
    }
}
