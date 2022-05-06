/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private String nombreProfesor;
    private int numeroAula;
    private int numeroDeEstudiantes;

    public Asignatura(int codigo, String nombre, String nombreProfesor, int numeroAula, int numeroDeEstudiantes) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreProfesor = nombreProfesor;
        this.numeroAula = numeroAula;
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public int getNumeroDeEstudiantes() {
        return numeroDeEstudiantes;
    }

    public void setNumeroDeEstudiantes(int numeroDeEstudiantes) {
        this.numeroDeEstudiantes = numeroDeEstudiantes;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", nombreProfesor=" + nombreProfesor + ", numeroAula=" + numeroAula + ", numeroDeEstudiantes=" + numeroDeEstudiantes + '}';
    }
    
    
    
    
}
