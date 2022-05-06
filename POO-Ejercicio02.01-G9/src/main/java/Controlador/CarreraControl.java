/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Asignatura;
import Modelo.Carrera;
import Servicio.CarreraServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class CarreraControl {
    public CarreraServicio carreraServicio = new CarreraServicio();
    

    public Carrera crear(int c, String n, String nD, int nE, int cA, String nA, String nP, int numA, int numE){
        var asignatura = new Asignatura(cA, nA, nP, numA, numE);
        var carrera = new Carrera(c, n, nD, nE, asignatura);
        this.carreraServicio.crear(carrera);
        return carrera;
    }
    
    public Carrera eliminar(int c) {
        return this.carreraServicio.eliminar(c);
    }
    
    public Carrera modificar(int c, Carrera c) {
        return this.carreraServicio.modificar(c,c);
    }
    
    
    
    public List<Carrera> listar()
    {
        return this.carreraServicio.listar();
    }
    
    
}
