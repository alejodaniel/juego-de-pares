/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenPares;

import java.util.Random;

public class AleatorioBotones {

    public int[] getPosicionBotonesAleatorios() {
//array del limite de numeros q queremos hacer en este caso 6 para q se mescle aleatoriamente
        int[] numeros = new int[10];
        int count = 0;

        while (count < 10) {
            Random r = new Random();
            int na = r.nextInt(5) + 1;
            int nvr = 0;

            for (int i = 0; i < 10; i++) {
                if (numeros[i] == na) {
                    nvr++;
                }
            }
            if (nvr < 2) {
                numeros[count] = na;
                count++;
            }
        }
        return numeros;
        
    }
}
