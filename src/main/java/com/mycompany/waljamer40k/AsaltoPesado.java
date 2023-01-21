/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waljamer40k;

/**
 *
 * @author Jours
 */
public class AsaltoPesado extends Juego{
    @Override
    public float AtaqueAsaltoPesado(double plusDefensa, double plusDaño, Juego p1) {
    System.out.println("daño "+daño+" vida "+vida+" fichas "+fichas+" nombre "+NombreDelJugador);
    double vidaRestante = p1.getVida()-getDaño();
    System.out.println("La vida es "+vidaRestante);
    if(vidaRestante<=0){
    System.out.println("la fiha "+NombreDelJugador+" A SIDO ELIMINADA");
     }
    return 0;
    }

    public AsaltoPesado (int vida, int daño, int fichas, int defensa,String NombreDelJugador){
    super (vida,  daño,  fichas,  defensa,  NombreDelJugador);
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public float AtaqueAsaltolijero(double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public float Drednout(double are, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float vehículo(double are, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float AtaqueDesollador(double rejeneracion, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float AtaqueTrasformadoAntiguo(double rejeneracion, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float AtaqueArañaCronoptica(double rejeneracion, double are, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float AtaqueEspectroCronoptica(double rejeneracion, double are, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public float AtaqueSiquico(double rejeneracion, double plusDefensa, double plusDaño, Juego p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

   

   
}
