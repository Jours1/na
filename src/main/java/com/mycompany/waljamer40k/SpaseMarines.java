/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.waljamer40k;

/**
 *
 * @author abund
 */
public class SpaseMarines {
  int asaltolijero, asaltopesado, drednot, vehículo, linaje, cantidadAsltolijero, siquico;
  int fichas;
    public SpaseMarines(int asaltolijero, int asaltopesado, int drednot, int vehículo, int linaje, int siquico) {
        this.asaltolijero = asaltolijero;
        this.asaltopesado = asaltopesado;
        this.drednot = drednot;
        this.vehículo = vehículo;
        this.linaje = linaje;
        this.siquico = siquico;
    }
void prorrogó(){
    System.out.println(" las unidades corepondientes para los SpaceMarines son asaltolijero,  ");
    System.out.println("asaltopesado, drednot, vehículo, linaje, cantidadAsltolijero, siquico");
    System.out.println("cada unidad tiene un inplementacion dada por sistems y el yamado de sus cales");
    System.out.println("cada calse es llamada por su nombre corespondiente cada ficha tiene unas caracteristicas");
    System.out.println("");
}   
    public int getAsaltolijero() {
        return asaltolijero;
    }

    public void setAsaltolijero(int asaltolijero) {
        this.asaltolijero = asaltolijero;
    }

    public int getAsaltopesado() {
        return asaltopesado;
    }

    public void setAsaltopesado(int asaltopesado) {
        this.asaltopesado = asaltopesado;
    }

    public int getDrednot() {
        return drednot;
    }

    public void setDrednot(int Drednot) {
        this.drednot = Drednot;
    }

    public int getVehículo() {
        return vehículo;
    }

    public void setVehículo(int vehículo) {
        this.vehículo = vehículo;
    }

    public int getLinaje() {
        return linaje;
    }

    public void setLinaje(int linaje) {
        this.linaje = linaje;
    }

    public int getSiquico() {
        return siquico;
    }

    public void setSiquico(int siquico) {
        this.siquico = siquico;
    }

  
   

   
 
public void AsaltoLijero(){
    
    if(asaltolijero >=0 ){
       
      
        System.out.println("El asalto lijero es un unidad bersatil la avilida principal es saltar ");
        System.out.println("unas fichas en especial, infanteria y blienadods, al acerlo recibe un ");        
        System.out.println("amuneto dearmaduta del 25% al igual que la salud");
        
       
         if(asaltopesado==0){
             System.out.println("");
            System.out.println("Adecidio no unsar la unidad de Asalto lijero");
            System.out.println("");

             return;
        }
        if(asaltopesado>=1 && asaltopesado<=11){
            System.out.println("las unidad de asalto lijero son "+asaltopesado+"");
            System.out.println("");
           
            return;
        }
       
            if(asaltopesado>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
 
 // asalto liejro
}
public void AsaltoPesado(){
    
    if(asaltolijero >=0 ){
       
      
        System.out.println("El asalto pesado es una unidad capas de atacar efectivamente veiculo ");
        System.out.println("la al recivir da;o por parte de un blendado o veiculo recive 20% mas  ");        
        System.out.println(" de salud adicinalmente si el escudron es superior a 3 reciben un aumnto ");
        System.out.println("en alcanse");
            
        
       
         if(asaltolijero==0){
             System.out.println("");
            System.out.println("Adecidio no unsar la unidad de Asalto Pesado");
            System.out.println("");

             return;
        }
        if(asaltolijero>=1 && asaltolijero<=11){
            System.out.println("las unidad de asalto pesado son "+asaltolijero+"");
            System.out.println("");
           
            return;
        }
       
            if(asaltolijero>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
 
 // asalto pesado
}
    
public void Dretnout(){
    
    if(drednot >=0 ){
       
      
        System.out.println("El drenot es na uniddad blindada versatil en el campo de batall el ataque es");
        System.out.println("en area dise;ado para comvatir infanteria y veiculos su alcanse es limitado ");        
        System.out.println(" las unidades drednot sacrifican da;o por velocidad solo se pude mover con un  ");
        System.out.println("numero mallor a 3 o sacrificar da;o al rival");
     
            
        
       
         if(drednot==0){
             System.out.println("");
            System.out.println("Adecidio no unsar la unidad drenot");
            System.out.println("");

             return;
        }
        if(drednot>=1 && drednot<=11){
            System.out.println("las unidad dretnot son "+drednot+"");
            System.out.println("");
           
            return;
        }
       
            if(drednot>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
 
 // DREDNOT
}
 public void Siqico(){
    
    if(siquico >=0 ){
       
      
        System.out.println("los quicos son unidades de apollo amlifican el alcanse dee la unidades adicionalmente");
        System.out.println("la unidad pocee la alilidad de crudar el tablero a amnera de torre ");        
   
            
        
       
         if(drednot==0){
             System.out.println("");
            System.out.println("Adecidio no unsar la unidad siquico");
            System.out.println("");

             return;
        }
        if(siquico>=1 && siquico<=11){
            System.out.println("las unidad siquicas son "+siquico+"");
            System.out.println("");
           
            return;
        }
       
            if(siquico>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
 
 // SIQUICO

}

 public void Veiculos(){
    
    if(vehículo >=0 ){
       
      
        System.out.println("son unidades de ataque capases de acer avansar mas la unidades inflijir da;o");
        System.out.println("y otorga un 10% mas de salud, su avanse es de 2 en 2 ");        
   
            
        
       
         if(vehículo==0){
             System.out.println("");
            System.out.println("Adecidio no unsar la unidad siquico");
            System.out.println("");

             return;
        }
        if(vehículo>=1 && vehículo<=11){
            System.out.println("las unidad vehículo son "+vehículo+"");
            System.out.println("");
           
            return;
        }
       
            if(vehículo>=7){
         System.out.println("EROR EL VALOR NO ESTA DEFINIDO");
        }
    }
 
 // SIQUICO

}
   public  void FichasSpaseMarines(){
       fichas=asaltolijero+ asaltopesado+ drednot+ vehículo+siquico;

       
        if(fichas>=11){
           System.out.println("HAY DEMACIADAS FCIHAS");
       }

       
        if(fichas<=10){
           System.out.println("las fichas son "+fichas+" ");
           
       }

   }
  
}
