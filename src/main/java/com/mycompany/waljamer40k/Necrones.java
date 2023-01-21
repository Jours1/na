/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waljamer40k;

/**
 *
 * @author abund
 */
public class Necrones {
     int Desollador, trasformadoAntiguo,ArañaCronoptica,espectrocronoscopico;
     int fichas;

    public Necrones(int Desollador, int trasformadoAntiguo, int ArañaCronoptica, int espectrocronoscopico, int fichas) {
        this.Desollador = Desollador;
        this.trasformadoAntiguo = trasformadoAntiguo;
        this.ArañaCronoptica = ArañaCronoptica;
        this.espectrocronoscopico = espectrocronoscopico;
        this.fichas = fichas;
    }

    public int getFichas() {
        return fichas;
    }

    public void setFichas(int fichas) {
        this.fichas = fichas;
    }

    

    public int getDesollador() {
        return Desollador;
    }

    public void setDesollador(int Desollador) {
        this.Desollador = Desollador;
    }

    public int getTrasformadoAntiguo() {
        return trasformadoAntiguo;
    }

    public void setTrasformadoAntiguo(int trasformadoAntiguo) {
        this.trasformadoAntiguo = trasformadoAntiguo;
    }

    public int getArañaCronoptica() {
        return ArañaCronoptica;
    }

    public void setArañaCronoptica(int ArañaCronoptica) {
        this.ArañaCronoptica = ArañaCronoptica;
    }

    public int getEspectrocronoscopico() {
        return espectrocronoscopico;
    }

    public void setEspectrocronoscopico(int espectrocronoscopico) {
        this.espectrocronoscopico = espectrocronoscopico;
    }
    public void FichasNecrones(){
        fichas= Desollador+ trasformadoAntiguo+ArañaCronoptica+espectrocronoscopico;
        System.out.println("La cantidad de fichas es "+fichas);
    }
   
    
// inida de desollador 
    public void Desollador1(){
    
    if(Desollador >=0 ){
       
      
        System.out.println("Los desolladores son una unidad necron el abase es unidad separada si ");
        System.out.println("el grupo de necrones es mallor a 3 reciben un pus de daño de 20% son capas de ");        
        System.out.println("rejenerarse si la unidad esta abansando sola, la regeneracion es por turnos y ");
        System.out.println("perende del la cantidad de mobimientos entre mas abase ma bida rejenera solo desolladores");
       
         if(Desollador==0){
            System.out.println("");
            System.out.println("A decidio no unsar la unidad necron desollador");
            System.out.println("");

             return;
        }
        if(Desollador>=1 && Desollador<=11){
            System.out.println("las unidad de asalto lijero son "+Desollador+"");
            System.out.println("");
           
            return;
        }
       
            if(Desollador>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
  }
    // Trasformado antiguo
        public void TrasformadoAntiguo1(){
    
    if(trasformadoAntiguo >=0 ){
       
      
        System.out.println("La unidad trasformado oscuro es una unidad unica se especilisa en largas distancia y en blinadods");
        System.out.println("la unidad solo se pude mober de ha 2 si es atacado por un blidado o simlilar desplega un escudo que le inpide ");        
        System.out.println("que el daño pase a las unidads que ballas antes de el");
        
       
         if(trasformadoAntiguo==0){
            System.out.println("");
            System.out.println("A decidio no unsar la unidad necron trasformadoAntiguo");
            System.out.println("");

             return;
        }
        if(trasformadoAntiguo>=1 && trasformadoAntiguo<=11){
            System.out.println("las unidad de asalto lijero son "+trasformadoAntiguo+"");
            System.out.println("");
           
            return;
        }
       
            if(trasformadoAntiguo>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
  }
        //araña conoscopica 
        public void ArañaCronoptica(){
    
    if(ArañaCronoptica >=0 ){
       
      
        System.out.println("la araña conoscoplca es una unidad necron epecialisada en infanteria capas de moberse por encima");
        System.out.println("de las unidades aliadas y unidads enemigas su daño es en area y tiene un daño en area ");        
        System.out.println("cundo la araña abansa 3 unidades de tablero se rejenera un 20% delas saluda total");
        
       
         if(ArañaCronoptica==0){
            System.out.println("");
            System.out.println("A decidio no unsar la unidad necron ArañaCronoptica");
            System.out.println("");

             return;
        }
        if(ArañaCronoptica>=1 && ArañaCronoptica<=11){
            System.out.println("las unidad de asalto lijero son "+ArañaCronoptica+"");
            System.out.println("");
           
            return;
        }
       
            if(ArañaCronoptica>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
  }
     //  
         public void Espectrocronoscopico(){
    
    if(espectrocronoscopico >=0 ){
       
      
        System.out.println("es una unidad que muebe infanteria, cundo esta en uso la unidad deja de acer daño ");
        System.out.println("la capasidad maxima es de 4 unidades de infanteria conpesa blindaje con daño solo se puede ");        
        System.out.println("tener 2 unidades si se llamas las 2 unidades el daño aumenta pero el trasporte de unidades ");
        System.out.println("disminille a la mitad extra de bledaje 30%");
       
         if(espectrocronoscopico==0){
            System.out.println("");
            System.out.println("A decidio no unsar la unidad necron Espectrocronoscopicoa");
            System.out.println("");

             return;
        }
        if(espectrocronoscopico>=1 && espectrocronoscopico<=11){
            System.out.println("las unidad de asalto lijero son "+espectrocronoscopico+"");
            System.out.println("");
           
            return;
        }
       
            if(espectrocronoscopico>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
  }
  }

