/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

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
    public void setnombre(){
        this.nombre = nombre;
    }
    
    public String getdireccion(){
        return direccion;
    }
    public void setdireccion(){
        this.direccion = direccion;
    }
    
    public int getestrellas(){
        return estrellas;
    }
    public void setestrellas(){
        this.estrellas = estrellas;
    }
    
    public int getn_Habitaciones(){
        return n_Habitaciones;
    }
    public void setn_Habitaciones(){
        this.n_Habitaciones=n_Habitaciones;
    }
            
}
