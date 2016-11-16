/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mema2.pkg0;

/**
 *
 * @author rowor
 */
public class Estudiante{
    private String nombre;
    private String carrera;
    private int edad;
    private String Contrasena;
    
    public Estudiante(String nombre,String carrera,int edad,String Contrasena){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
        this.Contrasena=Contrasena;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setContrasena(String contrasena){
        this.Contrasena=contrasena;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCarrera(){
        return carrera;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getContrasena(){
        return Contrasena;
    }
}
