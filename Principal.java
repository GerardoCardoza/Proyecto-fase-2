/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mema2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author rowor
 */
public class Principal {
    public static void main (String[] args){
        /*try {
        Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://localhost", "neo4j","neo4j1");
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("MATCH (n:User) RETURN n.name");
            while (rs.next()) {
                System.out.println(rs.getString("n.name"));
            }
        }
        con.close();
        
         }catch (Exception ex){
            System.out.println("AAA");
        }*/
        
        
        
        Conexion miCon=new Conexion();
        Estudiante e1=new Estudiante("pedro","mecatronica",21,"jla");
        //Estudiante e2=new Estudiante("luis","mecatronica",23,"123456");
        //Restaurante r1=new Restaurante("Red","uvg","sandwiches","chimichanga");
        //miCon.crearRestaurante(r1);
        //miCon.crearEstudiante(e1);
        //miCon.crearEstudiante(e2);
        //miCon.crearAmigo(e1, e2);
        //miCon.crearCliente(e1, r1);
        //miCon.deleteEstudiante(e1);
        
        miCon.Recomendar(e1);
       
    }
}
