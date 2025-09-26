package model;

public class Veterinario {
    private String nombres;
    private String id;
    private String tarjetaProfesional;
    private int aniosExperiencia;
    private Especialidad especialidad;
    private String telefono;
    private String correo;

    public Veterinario(String nombres, String id, String tarjetaProfesional, int aniosExperiencia, Especialidad especialidad, String telefono, String correo) {
        this.nombres = nombres;
        this.id = id;
        this.tarjetaProfesional = tarjetaProfesional;
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombres='" + nombres + '\'' +
                ", id='" + id + '\'' +
                ", tarjetaProfesional='" + tarjetaProfesional + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", especialidad=" + especialidad +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
