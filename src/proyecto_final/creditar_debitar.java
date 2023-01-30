/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.Scanner;
/**
 *
 * @author Emiliano
 */
public class creditar_debitar {
    public static float depositar(){
        Scanner s = new Scanner(System.in);
        float numero = -1;        
        System.out.print("Ingrese el deposito: ");
        while (numero <= 0){
            numero = s.nextInt();
            if (numero<=0) {
                System.out.print("Ingrese un deposito valido:  ");
            }           
        
        }
        System.out.println("¡Dinero Depositado!: " + numero);
        return numero;
    }
    public static float quitar( float saldado){
        Scanner s = new Scanner(System.in);
        boolean bandera;
        float numerAL;
        System.out.print("tipee el retiro: ");
        do{                              
            numerAL = s.nextFloat();
            if (numerAL < saldado && numerAL > 0){                                              
                    break;
            } else {
                bandera = true;
                System.out.print("Ingrese un retiro valido:");
            }
        } while (bandera=true);        
        System.out.println("¡OPERACIÓN REALIZADA SATISFACTORIAMENTE!: " + numerAL);
        return numerAL;
    }
}
