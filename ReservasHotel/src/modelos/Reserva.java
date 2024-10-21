/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author pc
 */
public class Reserva {
    public static final String NOMBRE = "PEPE TORRES";
    public static  final String DNI = "98764876C";
    public static final String TIPOHABITACION = "Doble";
    public static final int PRECIO = 30;
    
    private String nombre;
    private Habitacion habitacion;
    private Cliente cliente;
    private String dni;
    private String tipohabitacion;
    private int precio;

    //Constructor paramétrico
    public Reserva(String nombre, String dni, String tipohabitacion, int precio) {
        this.nombre = nombre;
        this.dni = dni;
        this.tipohabitacion = tipohabitacion;
        this.precio = precio;
    }
    
    //Constructor vacío
    public Reserva(){
        this(NOMBRE, DNI, TIPOHABITACION, PRECIO);
    }
    
    //constructor copia
    public Reserva(Reserva otro){
        this(otro.nombre, otro.dni, otro.tipohabitacion, otro.precio);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTipohabitacion() {
        return tipohabitacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Reserva{" + "nombre=" + nombre + ", dni=" + dni + ", tipohabitacion=" + tipohabitacion + ", precio=" + precio + '}';
    }
    
    
    
}
