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
public class Consume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo consumo1= new Consumo ();
        consumo1.setLitros(50f);
        consumo1.setPGas(1.57f);
        Consumo consumo2= new Consumo (43f ,3f ,57f,6f);
        consumo2.consumoMedio ();
        consumo2.setLitros(7);
        consumo2.amosar();
    }
    
}
