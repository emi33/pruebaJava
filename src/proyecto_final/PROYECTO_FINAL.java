/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;




import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import static proyecto_final.Mostrar_opciones.mostrar_opciones;

import static proyecto_final.Usuario_contrasena.userpass;
import static proyecto_final.bienvenida.bienvenidamuestra;
import static proyecto_final.creditar_debitar.depositar;
import static proyecto_final.creditar_debitar.quitar;


/**
 *
 * @author Emiliano
 * */
public class PROYECTO_FINAL {

    /**
     * param args the command line arguments
     */
    public static int doblecondicion;
    public static void main(String[] args) {
        // TODO code application logic here
        int condicion, flg = 0;      
        Usuario emiliano = new Usuario("Emiliano Choque", 123456789);  
        bienvenidamuestra();
        do {
            Usuario emi = userpass();
            condicion = 1;
        if (emi.equals(emiliano)){
            System.out.println("***************************************************");
            System.out.println("   Bienvenido usuario: " + emi.getNombre());
            System.out.println("***************************************************");
            doblecondicion = 0;
            
        } else if (emi.getNombre().equals("0")) {
            System.out.println("********************************************"); 
            System.out.println("**** Gracias por usar nuestro sistema ******");  
            System.out.println("********************************************"); 
            doblecondicion = 1;
            condicion = 1;
        } else {
                System.out.println(""); 
                System.out.println("Error en usuario o contraseña. Ingrese nuevamente"+ "\n");
                condicion = 0;               
            }
        } while (condicion != 1);
       ///////////////////////////////////////////////////
        String [] opes = {"Depositar", "Sacar plata", "Mostrar saldo", "Acciones realizadas","Salir"};
        if (doblecondicion !=1 ) {
            
            CuentaBancaria cls = new CuentaBancaria();
            cls.cuentaBancaria(emiliano.getNombre());
            do {         
                mostrar_opciones();
                Scanner s = new Scanner(System.in);
                int opSel = s.nextInt();                  
                if (opSel>=1 && opSel<=3) {                    
                    switch (opSel) {
                        case 1:
                            System.out.println(opes[0]);
                            float b = depositar();                           
                            cls.acreditar(b);  
                            System.out.println("Seleccione una nueva opcion");
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println(opes[1]);
                            float v = quitar(cls.saldo);                        
                            cls.debilitar(v);
                            System.out.println("Seleccione una nueva opcion"); 
                            System.out.println("");
                            break;
                        default:   
                            System.out.println(opes[2]);                            
                            float f = cls.Saldar();
                            System.out.println("Saldo total: " + f);
                            System.out.println("Seleccione una nueva opcion");
                            System.out.println("");
                            break;
                    }                    
                }   else if (opSel == 4) {        
                    System.out.println(opes[3]);
                    System.out.println("--------------------------------------------");
                    List<String> ops = cls.getOps();
                    Iterator it = ops.iterator();
                    IntStream.range(0, ops.size()).forEach(i -> System.out.println((i+1)+": "+ops.get(i)));  
                    System.out.println("--------------------------------------------");
                    System.out.println("Seleccione una nueva opcion");
                    System.out.println("");
                } else if (opSel == 5 ) {
                    System.out.println(opes[4]);
                    System.out.println("");
                    System.out.println("Escribe el cero en Usuario para salir: ");
                    
                    do{
                         Usuario emi = userpass(); 
                         if (emi.getNombre().equals("0") ) {
                         flg=2;
                        } else {
                             System.out.println("De nuevo! Escribe el cero en Usuario para salir:");
                         }
                    } while(flg!=2);                                                                                                      
                } else {
                     System.out.println("La opción elegida no es correcta, seleccione nuevamente");
                }                         
                } while (flg == 0);
        }
        
                
    }             
}
