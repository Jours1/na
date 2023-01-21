/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waljamer40k;

/**
 *
 * @author abund
 */
public abstract  class Juego {
   int vida, daño, fichas, defensa ;
   String NombreDelJugador;

    public Juego(int vida, int daño, int fichas, int defensa, String NombreDelJugador) {
        this.vida = vida;
        this.daño = daño;
        this.fichas = fichas;
        this.defensa = defensa;
      
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public String getNombreDelJugador() {
        return NombreDelJugador;
    }

    public void setNombreDelJugador(String NombreDelJugador) {
        this.NombreDelJugador = NombreDelJugador;
    }
  
     public abstract  class   Primarca{
         int LionElJonson,Fulgrim,Perturabo,LemanRuss,RogalDorn,Sanguinius,Angron,Mortarion,Vulkan;  

    public Primarca(int LionElJonson, int Fulgrim, int Perturabo, int LemanRuss, int RogalDorn, int Sanguinius, int Angron, int Mortarion, int Vulkan) {
        this.LionElJonson = LionElJonson;
        this.Fulgrim = Fulgrim;
        this.Perturabo = Perturabo;
        this.LemanRuss = LemanRuss;
        this.RogalDorn = RogalDorn;
        this.Sanguinius = Sanguinius;
        this.Angron = Angron;
        this.Mortarion = Mortarion;
        this.Vulkan = Vulkan;
    }

    public int getLionElJonson() {
        return LionElJonson;
    }

    public void setLionElJonson(int LionElJonson) {
        this.LionElJonson = LionElJonson;
    }

    public int getFulgrim() {
        return Fulgrim;
    }

    public void setFulgrim(int Fulgrim) {
        this.Fulgrim = Fulgrim;
    }

    public int getPerturabo() {
        return Perturabo;
    }

    public void setPerturabo(int Perturabo) {
        this.Perturabo = Perturabo;
    }

    public int getLemanRuss() {
        return LemanRuss;
    }

    public void setLemanRuss(int LemanRuss) {
        this.LemanRuss = LemanRuss;
    }

    public int getRogalDorn() {
        return RogalDorn;
    }

    public void setRogalDorn(int RogalDorn) {
        this.RogalDorn = RogalDorn;
    }

    public int getSanguinius() {
        return Sanguinius;
    }

    public void setSanguinius(int Sanguinius) {
        this.Sanguinius = Sanguinius;
    }

    public int getAngron() {
        return Angron;
    }

    public void setAngron(int Angron) {
        this.Angron = Angron;
    }

    public int getMortarion() {
        return Mortarion;
    }

    public void setMortarion(int Mortarion) {
        this.Mortarion = Mortarion;
    }

    public int getVulkan() {
        return Vulkan;
    }

    public void setVulkan(int Vulkan) {
        this.Vulkan = Vulkan;
    }
   
    int suma=LionElJonson+Fulgrim+Perturabo+LemanRuss+RogalDorn+Sanguinius+Angron+Mortarion+Vulkan;
    
     }
    
    //Atque de las unidades EspaseMarines
    /*---------------------------------------------------------------------------------------------------------------------------------------------------*/
     public abstract float AtaqueAsaltolijero(                     double plusDefensa, double plusDaño, Juego p1);
     public abstract float AtaqueSiquico     (double  rejeneracion,double plusDefensa, double plusDaño, Juego p1);
     public abstract float AtaqueAsaltoPesado(                     double plusDefensa,  double plusDaño, Juego p1);
     public abstract float Drednout          (double  are,         double plusDefensa, double plusDaño, Juego p1);
     public abstract float vehículo          (double  are,         double plusDefensa, double plusDaño, Juego p1);
     /*---------------------------------------------------------------------------------------------------------------------------------------------------*/
    // Ataque necron    
     /*---------------------------------------------------------------------------------------------------------------------------------------------------*/
     public abstract float AtaqueDesollador        (double rejeneracion, double plusDefensa, double plusDaño, Juego p1 ); 
     public abstract float AtaqueTrasformadoAntiguo(double rejeneracion, double plusDefensa, double plusDaño, Juego p1);  
     public abstract float AtaqueArañaCronoptica   (double rejeneracion, double  are,double plusDefensa, double plusDaño, Juego p1); 
     public abstract float AtaqueEspectroCronoptica(double rejeneracion, double  are,double plusDefensa, double plusDaño, Juego p1); 
     


  
   
}
