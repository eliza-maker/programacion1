package app;

import model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

    public static void main(String[] args) {
        ArrayList<Propietario>listaPropietarios=new ArrayList<>();
        ArrayList<Veterinario>listaVeterinarios=new ArrayList<>();
        ArrayList<Cita>listaCitas=new ArrayList<>();

        Veterinaria veterinaria=new Veterinaria("centro","Amigos Peludos ","156786");
        boolean bandera=true;
        do{
           int opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú de opciones:\n" +
                   "1. Crear mascota\n" +
                   "2. Leer\n" +
                   "3. Actualizar\n" +
                   "4. Eliminar\n" +
                   "5. Salir"));
           switch (opcion){
               case 1:
                   System.out.println("creando");
                   String codigo = JOptionPane.showInputDialog("Ingrese el código de la mascota: ");
                   String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota: ");
                   String especie = JOptionPane.showInputDialog("Ingrese la especie de la mascota: ");
                   String raza = JOptionPane.showInputDialog("Ingrese la raza de la mascota: ");
                   int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota: "));
                   String color = JOptionPane.showInputDialog("Ingrese el color de la mascota: ");
                   String peso = JOptionPane.showInputDialog("Ingrese el peso de la mascota: ");
                   String[] enfermedades = new String[4];
                   for (int j = 0; j < enfermedades.length; j++) {
                       enfermedades[j] = JOptionPane.showInputDialog("Ingrese la enfermedad " + (j + 1) + ": ");
                   }

                   Mascota mascota = new Mascota(codigo, nombre,especie, raza, edad, color,peso,enfermedades);
                   veterinaria.agregarMascota(mascota);
                   break;
               case 2:
                   System.out.println("Leer");
                   codigo=JOptionPane.showInputDialog("Ingrese el codigo para buscar la mascota");
                   System.out.println(veterinaria.mostrarMascota(codigo));
                   JOptionPane.showMessageDialog(null,veterinaria.mostrarMascota(codigo));

                   break;
               case 3:
                   System.out.println("actualizar");
                   codigo=JOptionPane.showInputDialog("Ingrese el codigo para buscar la mascota");
                   mascota =veterinaria.mostrarMascota(codigo);

                   if (mascota == null){
                       System.out.println("No existe la mascota");
                   }else {
                       mascota.setNombre("lupe");

                       veterinaria.actualizarMascota(codigo,mascota);
                   }

                   break;
               case 4:
                   System.out.println("eliminar");

                   codigo=JOptionPane.showInputDialog("Ingrese el codigo para buscar la mascota");
                   mascota =veterinaria.mostrarMascota(codigo);

                   if (mascota == null){
                       System.out.println("No existe la mascota");
                   }else {

                       veterinaria.eliminarMascota(codigo);

                   }

                   break;
               case 5:
                   System.out.println("salir");
                   bandera=false;
                   break;
               default:
                   System.out.println("Elija una opción correcta");
           }
        }while(bandera);


        System.out.println("Mascotas registradas:");
        System.out.println(veterinaria.getListaMascota());


        Propietario propietario= new Propietario("Raul", "Aranza", "123","3002564154", "Ramona 23 Cra 5");
        listaPropietarios.add(propietario);


        Veterinario veterinario= new Veterinario("Alejandra", "165","1254", 22, Especialidad.CIRUGIA, "3008769747", "ale98iu@hotmail.com");
        listaVeterinarios.add(veterinario);

        Cita cita=new Cita("123", LocalDate.now(), "2:30", 3000.0,"Le duele mucho la pata derecha", "Programada", 1);
        listaCitas.add(cita);

        System.out.println(listaPropietarios);
        System.out.println(listaVeterinarios);
        System.out.println(listaCitas);


    }
}
