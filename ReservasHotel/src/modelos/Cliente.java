/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Objects;

/**
 *
 * @author pc
 */
public class Cliente {
    public static final String NOMBRE = "PEPE TORRES";
    public static final int TELEFONO = 890458762;
    public static final String EMAIL = "myhotel@ugr.es";
    public static final String DNI = "34876589W";
    
    private String nombre;
    private int telefono;
    private String email;
    private String dni;
    
    //Constructor parametrico
    public Cliente(String nombre, int telefono, String email, String dni){
        this.nombre=NOMBRE;
        this.telefono=TELEFONO;
        this.email=EMAIL;
        this.dni=DNI;           
    }
    
    //Constructor vacio
    public Cliente(){
        this(NOMBRE, TELEFONO, EMAIL, DNI);
    }
    
    //Constructor copia
    public Cliente(Cliente otro){
        this(otro.nombre, otro.telefono, otro.email, otro.dni);
    }
    
    //Getters y Setters
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    
    public int gettelefono(){
        return telefono;
    }
    public void settelefono(int telefono){
        this.telefono=telefono;
    }
    
    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email=email;
    }
    
    public String getdni(){
        return dni;
    }
    public void setdni(String dni){
        this.dni=dni;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + ", dni=" + dni + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Cliente other = (Cliente) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }
    
    
}
