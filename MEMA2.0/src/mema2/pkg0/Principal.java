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
        try {
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
        }
    }
}
