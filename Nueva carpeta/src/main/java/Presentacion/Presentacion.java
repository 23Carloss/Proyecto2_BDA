/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Presentacion;

import Dominio.AlumnoDominio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author HP
 */
public class Presentacion {

    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("LaboratoriosComputo");
        EntityManager manejador = fabrica.createEntityManager();
        manejador.getTransaction().begin();
        AlumnoDominio alumnoPrueba = new AlumnoDominio();
        alumnoPrueba.setNombreCompleto("Carloss 1.1");
        alumnoPrueba.setPassword("552834");
        manejador.persist(alumnoPrueba);
        manejador.getTransaction().commit();
        manejador.close();
        fabrica.close();
        
    }
}
