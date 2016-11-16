package mema2.pkg0;


import java.sql.*;
import java.util.HashSet;
import java.util.Map;

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
    
    public void deleteRestaurante(Restaurante r1){
        try {
            stmt.executeUpdate("MATCH (x:Restaurante{name:'"+r1.getNombre()+"'}) detach delete x");
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
    
    public void getEstudiante(String nombre){
        try{
            ResultSet rs = stmt.executeQuery("MATCH (Estudiante{name:"+nombre+"})-[rel:amigo]-(Amigo) return Amigo");
            Map map= (Map)rs.getObject("Amigo");
            String s=map.get("name").toString();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String[] Recomendar(Estudiante e1){
        String [] respuesta=new String[3];
        String[] res=new String[1000];
        String[] totalRestaurantes=new String[1000];
        try{
            ResultSet rs = stmt.executeQuery("MATCH (Estudiante{name:'"+e1.getNombre()+"'})-[rel:amigo]-(Amigo) return Amigo");
            int i=0;
            while (rs.next()){
                Map map = (Map)rs.getObject("Amigo");
                String s = map.get("name").toString();
                System.out.println(s);
                res[i]=s;
                    //tomando los restaurantes
                    ResultSet tesRest=stmt.executeQuery("MATCH (Estudiante{name:'"+s+"'})-[rel:Cliente]-(Restaurante) return Restaurante");
                    while(tesRest.next()){
                        Map tempMap=(Map)tesRest.getObject("Restaurante");
                        String t=tempMap.get("name").toString();
                        totalRestaurantes[i]=t;
                        System.out.println(t);
                    }
                i++;
            }          
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        //agregando en el hashset
        HashSet tempSet=new HashSet();
        for(int m=0;m<totalRestaurantes.length;m++){
            String nombreRes=totalRestaurantes[m];
            tempSet.add(nombreRes);
        }
        
        int[] frecuencias=new int[10];
        for(int q=0;q<frecuencias.length;q++)
            frecuencias[q]=0;
        
        String[] orden=new String[10];
        
        //obteniendo frecuencias
        int count=0;
        for(int n=0;n<res.length;n++){
            if(tempSet.contains(res[n])){
                frecuencias[count]=+1;
                orden[count]=res[n];
            }
        }
        
        for(int q=0;q<orden.length;q++)
            System.out.print(orden[q]);
        
        System.out.println();
        
        for(int q=0;q<frecuencias.length;q++)
            System.out.print(frecuencias[q]);
        
        System.out.println(orden[0]);
        return orden;
        
    }
        
  
}
