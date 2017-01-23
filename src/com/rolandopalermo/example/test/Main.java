/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.example.test;

import com.rolandopalermo.example.dao.TbVehiculosDAO;
import com.rolandopalermo.example.model.TbVehiculos;
import java.util.List;

/**
 *
 * @author Rolando
 */
public class Main {

    public static void main(String[] args) {
        TbVehiculosDAO dao = new TbVehiculosDAO();
        List<TbVehiculos> lstVehiculos = dao.selectAll();
        for (TbVehiculos tbVehiculos : lstVehiculos) {
            System.out.println(tbVehiculos.getId() + "\t" + tbVehiculos.getNumeroPlaca());
        }
        TbVehiculos nuevoVehiculo = new TbVehiculos();
        nuevoVehiculo.setFechaRegistro("2014-03-10");
        nuevoVehiculo.setIdModelo("1");
        nuevoVehiculo.setNumeroPlaca("Test");
        dao.insert(nuevoVehiculo);
        System.out.println("--------------------");
        lstVehiculos = dao.selectAll();
        for (TbVehiculos tbVehiculos : lstVehiculos) {
            System.out.println(tbVehiculos.getId() + "\t" + tbVehiculos.getNumeroPlaca());
        }
    }
}
