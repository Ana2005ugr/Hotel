/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author pc
 */
public class Habitacion {
    public final static int NUMHABITACION = 4;
    public final static String TIPOHABITACION = "suite ";
    public final static int PRECIO = 30;
    
    private int numHabitacion;
    private String tipoHabitacion;
    private int precio;
    
    //Constructor parametrico
    public Habitacion(int numhabitacion, String tipoHabitacion, int precio){
        this.numHabitacion=NUMHABITACION;
        this.tipoHabitacion=TIPOHABITACION;
        this.precio=PRECIO;
    }
    
    //Constructor vacio
    public Habitacion(){
        this(NUMHABITACION, TIPOHABITACION, PRECIO);
    }
    
    //Constructor copia
    public Habitacion(Habitacion otro){
        this(otro.numHabitacion, otro.tipoHabitacion, otro.precio);
    }
    
    //Getters y Setters
    public int getnumHabitacion(){
        return numHabitacion;
    }
    public void setnumHabitacion(){
        this.numHabitacion=numHabitacion;
    }
    
    public String gettipoHabitacion(){
        return tipoHabitacion;
    }
    public void settipoHabitacion(){
        this.tipoHabitacion=tipoHabitacion;
    }
    
    public int getprecio(){
        return precio;
    }
    public void setprecio(){
        this.precio=precio;
    }
    
}
