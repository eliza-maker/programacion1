package co.edu.uniquindio.co.poo.model;

public abstract class Animal {
    private String nombre;
    private String codigo;

    public Animal(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //Acá está el metodo abstracto
    public abstract void hacerSonido();

    public void comer(){
        System.out.println(nombre+"está comiendo");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}

