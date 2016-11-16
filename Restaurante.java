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
public class Restaurante{
    private String nombre;
    private String ubicacion;
    private String tipo;
    private String masConsumido;
    
    public Restaurante(String nombre,String ubicacion,String tipo,String masConsumido){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.tipo=tipo;
        this.masConsumido=masConsumido;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setUbicacion(String ubicacion){
        this.ubicacion=ubicacion;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public void setMasConsumido(String masConsumido){
        this.masConsumido=masConsumido;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String getUbicacion(){
        return ubicacion;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public String getMasConsumido(){
        return masConsumido;
    }
}
