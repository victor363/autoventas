/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import Gui.Principal;
import Persistencia.ControladoraPersistencia;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class Autoventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Registrar un vehiculo
//        ControladoraPersistencia control=new ControladoraPersistencia();
//        //Vehiculo vehi=new Vehiculo(1,"Toyota","2022","Rojo",new Date("09/30/2022"),50000);
//        Vehiculo vehi1=new Vehiculo(215288,"Mazda","2023","Gris",new Date("09/30/2021"),150000);
//        control.crearVehiculo(vehi1);
      Principal pr=new Principal();
      pr.setVisible(true);
      pr.setLocationRelativeTo(null);
      


    }
    
}
