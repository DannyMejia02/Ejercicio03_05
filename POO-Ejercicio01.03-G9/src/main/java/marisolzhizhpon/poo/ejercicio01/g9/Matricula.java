/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.poo.ejercicio01.g9;

/**
 *
 * @author marisolzhizhpon
 */
public class Matricula {
    private String color;
    private int placa;
    private String claseVehiculo;
    private int numeroMotor;

    public Matricula(String color, int placa, String claseVehiculo, int numeroMotor) {
        this.color = color;
        this.placa = placa;
        this.claseVehiculo = claseVehiculo;
        this.numeroMotor = numeroMotor;
    }
    
    public String obtenerPlaca(){
        return null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getClaseVehiculo() {
        return claseVehiculo;
    }

    public void setClaseVehiculo(String claseVehiculo) {
        this.claseVehiculo = claseVehiculo;
    }

    public int getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(int numeroMotor) {
        this.numeroMotor = numeroMotor;
    }
    
    
    
}
