/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.zhizhpon_mm;

import java.util.Scanner;

/**
 *
 * @author marisolzhizhpon
 */
public class Seleccion_Insercion {
    public static void main(String[] args){
        int num;
        Scanner b = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elementos: ");
        num = b.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Ingrese los valores: ");
            int dato = b.nextInt();
            
        }
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("1. Seleccion");
            System.out.println("2. Insercion");
            
            System.out.println("Escoja el algoritmo de ordenamiento");
            opcion = b.nextInt();
            
            switch(opcion){
                case 1:
                    int[] lista = {9,5,1,8,0};
                    for(int i = 0; i < lista.length; i++){
                        int posicionMenor = i;
                        for(int j = i+1; j<lista.length; j++){ 
                            if(lista[j]>lista[posicionMenor]){
                                posicionMenor = j;
                            }
                        }
                        if(i!=posicionMenor){
                            int aux = lista[i];
                            lista[i] = lista[posicionMenor];
                            lista[posicionMenor] = aux;
                        }
                    }
                    for (int i : lista) { 
                        System.out.print(i+" | ");
                    } 
                    break;
                case 2:
                    int[] lista1 = {9,5,1,8,0};
                    int j, aux = 0;
                    for(int i = 1; i<lista1.length; i++){
                        j = i;
                        aux = lista1[i];
                        while (j > 0 && aux>lista1[j-1]){
                            lista1[j] = lista1[j-1];
                            j --;
                            lista1[j] = aux;
                        }
                    }
                    for (int i : lista1) {
                        System.out.print(i + " | ");
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                    
            }
            
        }
            
     
    }
    
    
}
