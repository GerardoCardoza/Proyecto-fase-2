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
    
    public void crearEstudiante(Estudiante e1){
        try{
            stmt.executeUpdate("CREATE(" +e1.getNombre()+ ":Estudiante{name:'" +e1.getNombre()+ "',carrera:'" +e1.getCarrera()+ "',edad:'" +e1.getEdad()+"'})");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    public void crearRestaurante(Restaurante r){
        try{
            stmt.executeUpdate("CREATE("+r.getNombre()+":Restaurante{name:'"+r.getNombre()+"',tipo:'"+r.getTipo()+"',ubicacion:'"+r.getUbicacion()+"',AlimentoMasConsumdo:'"+r.getMasConsumido()+"'})");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void crearCliente(Estudiante e1, Restaurante r){
        try{
            stmt.executeUpdate("MATCH (x:Estudiante {name:'"+ e1.getNombre()+"'})MATCH (y:Restaurante{name:'"+r.getNombre()+"'})"+"MERGE (x)-[:Cliente]->(y)");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    } 
    
    public void deleteEstudiante(Estudiante e1){
        try {
            stmt.executeUpdate("MATCH (x:Estudiante{name:'"+e1.getNombre()+"'}) detach delete x");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void crearAmigo(Estudiante e1,Estudiante e2){
        try{
            stmt.executeUpdate("MATCH (x:Estudiante {name:'"+ e1.getNombre()+"'})MATCH (y:Estudiante{name:'"+e2.getNombre()+"'})"+"MERGE (x)-[:amigo]->(y)");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void Recomendar(Estudiante e1){
        String[] res=new String[3];
        try{
            stmt.executeUpdate("MATCH (Estudiante{name:'"+e1.getNombre()+"'})--(Estudiante) return Estudiante.nombre");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
        
  
}
