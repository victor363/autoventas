/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Vehiculo;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class ControladoraPersistencia {
    VehiculoJpaController vehiculoJPA = new VehiculoJpaController();
     public void crearVehiculo(Vehiculo vehiculo) {
        try {
            vehiculoJPA.create(vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarVehiculo(int id) {
        try {
            vehiculoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarVehiculo(Vehiculo vehiculo) {
        try {
            vehiculoJPA.edit(vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Vehiculo> traerVehiculo() {
            List <Vehiculo> listaAlumnos = vehiculoJPA.findVehiculoEntities();
        return listaAlumnos;
    }

    public Vehiculo encontrarVehiculo(int id) {
            Vehiculo vehi = vehiculoJPA.findVehiculo(id);
        return vehi;
    }
}
