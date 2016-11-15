package mema2.pkg0;


import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rowor
 */
public class Conexion {
    private Connection con;
    private Statement stmt;
    private final String USER="neo4j";
    private final String PASSWORD="neo4j1";
    static final String URL="jdbc:neo4j:bolt://localhost";
    
    //constructor
    public Conexion(){
        try{
            con= DriverManager.getConnection(URL,USER,PASSWORD);
            stmt=con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
    
    public void crearEstudiante(Estudiante e){
        stmt.executeUpdate("CREATE(" +e.getNombre()+ ":Estudiante{name:" +e.getNombre()+ ",carrera:" +e.getCarrera()+ ",edad:" +e.getEdad()+"})");
    }
    
    public void crearRestaurante(Restaurante r){
        stmt.executeUpdate("CREATE("+r.getNombre()+":Restaurante{name:"+r.getNombre()+",tipo:"+r.getTipo()+",ubicacion:"+r.getUbicacion()+",Alimento mas consumdo:"+r.getMasConsumido()+"})");
    }
    
    public void crearCliente(Estudiante e, Restaurante r){
        
    } 
    
    public void delete(){
        try {
            stmt.executeUpdate("MATCH (n) " +
                    "OPTIONAL MATCH (n)-[r]-()"+" delete n,r" );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void crearAmigo(Estudiante e1,Estudiante e2){
        try{
            stmt.executeUpdate("MATCH (x:User {name:"+ e1.getName()+"})MATCH (y:User{name:"+e2.getName()+"})");
        }
    }

    
}
