package model;

public class Gato extends Animal{
    private int bigotes;

    public Gato(String nombre, int bigotes) {
        super(nombre);
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
