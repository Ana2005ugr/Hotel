/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.*;

/**
 *
 * @author pc
 */
public class Hotel {
    public static final String NOMBRE = "granadoHotel";
    public static final String DIRECCION = "calleAlcala";
    public static final int ESTRELLAS = 4;
    public static final int N_HABITAACIONES = 200;
    
    private String nombre;
    private String direccion;
    private int estrellas;
    private int n_Habitaciones;
    //private List<Habitacion> listaHabitaciones = new ArrayList<>();
    
    //Constructor paramétrico
    public Hotel(String nombre, String direccion, int estrellas, int n_Habitaciones){
        this.nombre = NOMBRE;
        this.direccion = DIRECCION;
        this.estrellas = ESTRELLAS;
        this.n_Habitaciones = N_HABITAACIONES;
    }
    
    //Contructor vacío
    public Hotel(){
        this(NOMBRE, DIRECCION, ESTRELLAS, N_HABITAACIONES);
    }
    
    //Constructor copia
    public Hotel(Hotel otro){
        this(otro.nombre, otro.direccion, otro.estrellas, otro.n_Habitaciones);
    }
    
    //Getters y Setters
    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getdireccion(){
        return direccion;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
    
    public int getestrellas(){
        return estrellas;
    }
    public void setestrellas(int estrellas){
        this.estrellas = estrellas;
    }
    
    public int getn_Habitaciones(){
        return n_Habitaciones;
    }
    public void setn_Habitaciones(int n_Habitaciones){
        this.n_Habitaciones=n_Habitaciones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.direccion);
        hash = 97 * hash + this.estrellas;
        hash = 97 * hash + this.n_Habitaciones;
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
        final Hotel other = (Hotel) obj;
        if (this.estrellas != other.estrellas) {
            return false;
        }
        if (this.n_Habitaciones != other.n_Habitaciones) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", estrellas=" + estrellas + ", n_Habitaciones=" + n_Habitaciones + '}';
    }
    
    
            
}
