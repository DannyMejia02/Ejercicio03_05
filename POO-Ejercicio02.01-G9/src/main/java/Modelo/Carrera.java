/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Carrera {
    private int codigo;
    private String nombre;
    private String nombreDirecto;
    private int numeroEstudiantes;
    private Asignatura asignatura;

    public Carrera(int codigo, String nombre, String nombreDirecto, int numeroEstudiantes, Asignatura asignatura) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nombreDirecto = nombreDirecto;
        this.numeroEstudiantes = numeroEstudiantes;
        this.asignatura = asignatura;
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

    public String getNombreDirecto() {
        return nombreDirecto;
    }

    public void setNombreDirecto(String nombreDirecto) {
        this.nombreDirecto = nombreDirecto;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre 
                + ", nombreDirecto=" + nombreDirecto + ", numeroEstudiantes=" 
                + numeroEstudiantes + ", asignatura=" + asignatura + '}';
    }
    
    

    
    
    
    
}
