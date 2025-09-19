package co.edu.uniquindio.co.poo.model;

public class Perro extends Animal {

    public Perro(String nombre, String codigo) {
        super(nombre, codigo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro "+getNombre()+" hace gof gof");
    }
}
