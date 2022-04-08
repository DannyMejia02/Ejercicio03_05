/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.zhizhponm;

/**
 *
 * @author marisolzhizhpon
 */
public class Principal {
    public static void main(String[] args){
        
        var empleado = new Empleado();
        empleado.nombre = "Juan Lopez";
        empleado.horasTrabajadas = 110;
        empleado.costoHora = 1.60;
        empleado.añoIngreso = 2016;
        
        var empleado1 = new Empleado();
        empleado1.nombre = "Maria Escandon";
        empleado1.horasTrabajadas = 6;
        empleado1.costoHora = 1.40;
        empleado1.añoIngreso = 2018;
     
        var empleado2 = new Empleado();
        empleado2.nombre = "Julio Leon";
        empleado2.horasTrabajadas = 10 ;
        empleado2.costoHora = 1.90;
        empleado2.añoIngreso = 2015; 
        
        System.out.println("");
        var añoTrabajado=empleado.calcularIngresos(2022);
        System.out.println("El empleado tiene "+añoTrabajado+" años");
        
        
        
    }
    
}
