package model;

public class Tigre extends Animal{

    public Tigre(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El tigre "+getNombre()+ " hace grr");
    }
}
