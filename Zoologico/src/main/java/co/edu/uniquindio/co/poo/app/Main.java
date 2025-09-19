package co.edu.uniquindio.co.poo.app;

import co.edu.uniquindio.co.poo.model.*;

public class Main {
    public static void main(String[] args) {

        Zoologico zoo = new Zoologico("MiZoo");
        Animal p1=new Perro("Sam", "123");
        Animal g1=new Gato("Coco", "1234", 24);
        Animal t1=new Tigre("Diego", "2345");
        Animal p2=new Perro("Garra", "566");
        Animal g2=new Gato("Manchas", "4555", 54);

        zoo.registrarAnimal(p1);
        zoo.registrarAnimal(g1);
        zoo.registrarAnimal(t1);
        zoo.registrarAnimal(p2);
        zoo.registrarAnimal(g2);


        System.out.println(zoo.getListaAnimales());
        zoo.hacerSonidos();

    }
}