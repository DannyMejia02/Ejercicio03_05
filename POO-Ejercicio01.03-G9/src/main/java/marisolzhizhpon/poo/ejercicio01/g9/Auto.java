/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.poo.ejercicio01.g9;

/**
 *
 * @author marisolzhizhpon
 */
public class Auto {
    private String modelo;
    private int recorrido;
    private String marca;
    private double precio;

    public Auto(String modelo, int recorrido, String marca, double precio) {
        this.modelo = modelo;
        this.recorrido = recorrido;
        this.marca = marca;
        this.precio = precio;
    }
    
    public double obtenerMatricula(){
        return 0;
        
    }
    public String obtenerProvincia(){
        return null;
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
