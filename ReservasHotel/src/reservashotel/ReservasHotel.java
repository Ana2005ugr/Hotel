/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservashotel;

/**
 *
 * @author pc
 */

import modelos.Hotel;
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
        
    }
    
}
