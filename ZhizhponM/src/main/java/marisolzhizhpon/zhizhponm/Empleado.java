/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.zhizhponm;

/**
 *
 * @author marisolzhizhpon
 */
public class Empleado {
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int añoIngreso;
    
    public double calcularIngresos(int añoActual){
        var retorno = 1000d;
        var sueldo = costoHora*horasTrabajadas;
        var antiguedad = añoActual-añoIngreso;
        retorno = sueldo+(sueldo*0.02*antiguedad);
        
        return retorno;   
    }
    
    public double calcularBonoHorasExtra(int maximoHorasTrabajadas){
        var retorno = 160;
        if(this.costoHora>=160){
            retorno = horasTrabajadas-maximoHorasTrabajadas;
            retorno = retorno*2;
        }else{
            return retorno;
        }
        return 0;
        
    }
    
    public double calcularImpuesto(int limite, int limite1, int limite2, int limite3){
        var retorno = 2000d;
        if(this.horasTrabajadas>=0 && this.horasTrabajadas<=limite){
            if(this.costoHora>=0 && this.costoHora<=limite1)
                retorno = this.costoHora;
            
        }
        return 0;
        
        
    }
    
    public double calcularAPagar(){
        
        return 0;
        
    }
        
    
}
