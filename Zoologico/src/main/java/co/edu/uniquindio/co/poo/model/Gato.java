package co.edu.uniquindio.co.poo.model;

public class Gato extends Animal{
    private int bigotes;

    public Gato(String nombre, String codigo, int bigotes) {
        super(nombre, codigo);
        this.bigotes=bigotes;
    }


    @Override
    public void hacerSonido() {
        System.out.print("El gato "+getNombre()+" hace miau");
    }

    public void numBigotes(){
        System.out.print(getNombre()+" tiene "+bigotes+" bigotes.");
    }
}
