package co.edu.uniquindio.co.poo.model;

public class Tigre extends Animal{

    public Tigre(String nombre, String codigo) {
        super(nombre, codigo);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El tigre "+getNombre()+ " hace grr");
    }
}
