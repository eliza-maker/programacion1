package app;

import model.Gato;
import model.Perro;
import model.Zoologico;

import java.util.ArrayList;

public class Aplicacion {
    public static void main(String[]args){
        Zoologico zoo = new Zoologico("MiZoo",);
        zoo.registrarAnimal(new Perro("Rex"));
        zoo.registrarAnimal(new Gato("Michi", 4));
        zoo.registrarAnimal(new Perro("Firulais"));
        zoo.registrarAnimal(new Gato("Luna",6));
        zoo.registrarAnimal(new Perro("Max"));
    }
}
