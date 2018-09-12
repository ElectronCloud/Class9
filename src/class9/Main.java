/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        Llanta[] llantas= new Llanta[4];
        for (int i=0; i<4; i++){
            llantas[i]= new Llanta("X", "Y", 20);
        }
        Puerta[]puertas= new Puerta[5];
        for(int i=0; i<5; i++){
            puertas[i]=new Puerta("Z");
        }
        
        Motor motor  = new Motor("2",2);
        Automovil autor=
                new Automovil("X", 0, "Y", llantas, puertas, motor);
        
        System.out.println(autor.getPuerta()[1].getTipo());
        //Para mostrar todos con un ciclo
    }
}
