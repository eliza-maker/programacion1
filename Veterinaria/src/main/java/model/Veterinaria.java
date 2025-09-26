package model;

import java.util.ArrayList;

public class Veterinaria {
    private String ubicacion;
    private String nombre;
    private String nit;
    private ArrayList<Mascota> listaMascota;
    private ArrayList<Propietario>listaPropietarios;
    private ArrayList<Veterinario>listaVeterinarios;
    private ArrayList<Cita>listaCitas;

    public Veterinaria(String ubicacion, String nombre, String nit) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.nit = nit;
        this.listaMascota = new ArrayList<>();

    }

    public void agregarMascota(Mascota mascota){
        boolean bandera=true;
        for (Mascota mascotica: listaMascota){
            if(mascota.getCodigo().equals(mascotica.getCodigo())){
                bandera=false;
                break;
            }
        }

        if (bandera){
            listaMascota.add(mascota);
        }
    }

    public Mascota mostrarMascota(String codigo){
        Mascota mascotaSeleccionada=null;
        for (Mascota m:listaMascota){
            if(codigo.equals(m.getCodigo())){
                mascotaSeleccionada=m;
            }
        }
        return mascotaSeleccionada;
    }

    public void actualizarMascota(String codigo,Mascota mascota){

        for (int i = 0; i < listaMascota.size(); i++) {
            if(codigo.equals(listaMascota.get(i).getCodigo())){
                listaMascota.set(i,mascota);

            }
        }

    }

    public void eliminarMascota(String codigo){

        for (int i = 0; i < listaMascota.size(); i++) {
            if(codigo.equals(listaMascota.get(i).getCodigo())){
                listaMascota.remove(i);
            }
        }

    }

    public ArrayList<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(ArrayList<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }

    public void setNombre (String nombre){
        this.nombre=nombre;
    }

    public void setNit(String nit){
        this.nit=nit;
    }


    public String getUbicacion(){
        return ubicacion;
    }

    public String getNombre (){
        return nombre;
    }

    public String getNit (){
        return nit;
    }

    @Override
    public String toString() {
        return "Veterinaria{" +
                "ubicacion='" + ubicacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", listaMascota=" + listaMascota +
                '}';
    }
}
