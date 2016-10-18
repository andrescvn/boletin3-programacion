/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consume;

/**
 *
 * @author acomesanavila
 */
public class Consumo {
   private float  km, litros,vMed,pGas,tempo ;
   public Consumo(){
    km=0;
    litros=0;
    vMed=0;
    pGas=0;
    tempo=0;
}
           public Consumo(float km1,float l,float v , float p, float t){
               km=km1;
               litros=l;
               vMed=v;
               pGas=p;
               tempo=t;
           }
    public float getTempo(){
        return tempo;
   
    }
     public void consumoMedio(){
         /*float consumoMedio= litros/km;*/
        System.out.println("consumoMedio = "+ litros*100/km);
     }
     public float consumoEuros(){
         return (pGas*litros);
     }
     public void setKm(float km1){
         km= km1;
     }
     public void setLitros(float l){
         litros=l;
        
     }
     public void setVMed (float v){
         vMed=v;
     }        
     public void setPGas (float p){
         pGas=p;
         
     }    
     public void amosar (){
         System.out.println("Vmed ="+vMed);
     }
             
}
