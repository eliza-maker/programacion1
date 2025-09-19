package co.edu.uniquindio.co.poo.model;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private ArrayList<Animal> listaAnimales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public String registrarAnimal(Animal nuevoAnimal){
        String resultado = "";
        Animal animalEncontrado = null;

        animalEncontrado = buscarAnimal(nuevoAnimal.getCodigo());

        if(animalEncontrado == null){
            listaAnimales.add(nuevoAnimal);
            resultado = "El animal fúe registrado a el zoologico";
        }else{
            resultado = "El animal ya existe para el zoologico";
        }
        return resultado;
    }

    public Animal buscarAnimal(String codigo){
        Animal resultado = null;
        for(Animal animalAux : listaAnimales){
            if(animalAux.getCodigo().equals(codigo)){
                return animalAux;
            }
        }
        return resultado;
    }

    public String actualizarAnimal(String codigoActual,String nuevoNombre){
        String resultado = "";
        Animal animalEncontrado = null;

        animalEncontrado = buscarAnimal(codigoActual);
        if(animalEncontrado != null){
            animalEncontrado.setNombre(nuevoNombre);
            resultado = "La informacion del animal fúe actualizada correctamente";
        }else{
            resultado = "El animal no existe";
        }

        return resultado;
    }

    public String eliminarAnimal(String codigo){
        Animal animalEncontrado = null;

        animalEncontrado = buscarAnimal(codigo);

        if(animalEncontrado != null){
            listaAnimales.remove(animalEncontrado);
            System.out.println("Animal eliminado exitosamente");
            return "Animal eliminado exitosamente";
        }else{
            return "Animal no existe";
        }

    }

    //acá hay polimorfismo
    public void hacerSonidos() {
        System.out.println("Todos los animales hacen sonidos:");
        for (Animal a : listaAnimales) {
            a.hacerSonido();
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
