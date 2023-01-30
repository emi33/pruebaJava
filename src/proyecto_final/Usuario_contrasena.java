/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Emiliano
 */
public class Usuario_contrasena {
    
    /**
     *
     * @return
     */
    public static Usuario userpass() {
        System.out.print("Nombre de Usuario: ");
        Scanner s = new Scanner(System.in);
        int pass;
        String user = s.nextLine();
        if (user.equals("0")){
            pass = 0;
        } else{
            System.out.print("Contraseña: ");
            pass = s.nextInt();
        }
        Usuario resultado = new Usuario(user, pass);
        return resultado;
    }
}

    
class Usuario {
    String nombre;
    int contraseña;
    
    public Usuario(String nombre, int passw) {
        this.nombre = nombre;
        this.contraseña = passw;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.contraseña != other.contraseña) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}

