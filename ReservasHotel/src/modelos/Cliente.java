/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

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
    public void setnombre(){
        this.nombre=nombre;
    }
    
    public int gettelefono(){
        return telefono;
    }
    public void settelefono(){
        this.telefono=telefono;
    }
    
    public String getemail(){
        return email;
    }
    public void setemail(){
        this.email=email;
    }
    
    public String getdni(){
        return dni;
    }
    public void setdni(){
        this.dni=dni;
    }
}
