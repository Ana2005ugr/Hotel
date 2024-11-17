/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import modelos.Habitacion;
import modelos.Hotel;
import modelos.Cliente;
/**
 *
 * @author pc
 */

public class ReservasHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel test1 = new Hotel("GranadoHotel", "CalleAlcala" , 4 , 200);
        System.out.println(test1.getnombre() + " "+test1.getdireccion()+ " "+test1.getestrellas()+ " "+ test1.getn_Habitaciones());
        
        Hotel test2 = new Hotel();
        System.out.println(test2.getnombre() + " "+test2.getdireccion()+ " "+test2.getestrellas()+ " "+ test2.getn_Habitaciones());
        
        Hotel test3 = new Hotel(test1);
        System.out.println(test3.getnombre() + " "+test3.getdireccion()+ " "+test3.getestrellas()+ " "+ test3.getn_Habitaciones());
        
        
        Habitacion test1_hab = new Habitacion(4, " suite", 30);
        System.out.println(test1_hab.getnumHabitacion()+ " "+ test1_hab.gettipoHabitacion() +" "+test1_hab.getprecio());
        
        Habitacion test2_hab = new Habitacion();
        System.out.println(test2_hab.getnumHabitacion()+ " "+ test2_hab.gettipoHabitacion() +" "+test2_hab.getprecio());
        
        Habitacion test3_hab = new Habitacion(test1_hab);
        System.out.println(test3_hab.getnumHabitacion()+ " "+ test3_hab.gettipoHabitacion() +" "+test3_hab.getprecio());

        
        Cliente test1_Cli = new Cliente ("PEPE TORRES", 890458762, "myhotel@ugr.es", "34876589W");
        System.out.println(test1_Cli.getnombre()+" "+ test1_Cli.gettelefono()+" "+ test1_Cli.getemail()+" "+ test1_Cli.getdni());
        
        Cliente test2_Cli = new Cliente();
        System.out.println(test2_Cli.getnombre()+" "+ test2_Cli.gettelefono()+" "+ test2_Cli.getemail()+" "+ test2_Cli.getdni());
            
        Cliente test3_Cli = new Cliente(test1_Cli);
        System.out.println(test3_Cli.getnombre()+" "+ test3_Cli.gettelefono()+" "+ test3_Cli.getemail()+" "+ test3_Cli.getdni());

    }
    
}
