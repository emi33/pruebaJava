/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Emiliano
 */
public class CuentaBancaria {
    String numeroId;
    List<String> ops;
    float saldo;
    
   public List<String> getOps() {
       return ops;
   }
    public void cuentaBancaria(String numeroId){
        this.numeroId = numeroId;
        this.ops = new ArrayList();
        saldo = 5000;   
    }
    public float transferirsaldo(){
        float numero;
        numero = getSaldo();
        return numero;
    }
    public float Saldar (){
        String x = "Mostrar Saldo";         
        ops.add(x);
        return getSaldo();
    }
    public void acreditar (float importe){
        this.saldo = saldo + importe;       
        String o = "Credito";              
        ops.add(o);
    }
    public void debilitar (float importe){
        this.saldo = saldo - importe;        
        String r = "Debito";                     
        ops.add(r);
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){     
        this.saldo = saldo;
    }
    public String getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(String numeroId) {
        this.numeroId = numeroId;
    }

    

   
    

}

