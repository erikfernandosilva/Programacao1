/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0909;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author ferna
 */
public class Media {
    public static void main (String[] args){
        // array notas com valores: 7, 8, 6, 9, 10
        // a media das notas: 8
        // as notas maiores que 7: 8,9,10
        // a maior nota: 10
        int notas[] = new int [5];
        notas[0]=7;
        notas[1]=8;
        notas[2]=6;
        notas[3]=9;
        notas[4]=10;
        
        // organizados em ordem crescente
        // utilizando o sistema array.sort
        /*
        Arrays.sort (notas);
        System.out.println ("Organizados em ordem crescente:");
        System.out.println (Arrays.toString(notas));
        */
        
        // media das notas.
        int soma = 0;
        for (int i = 0;i <= notas.length-1;i++){
            soma = soma + notas[i];
        }
        int media = soma / notas.length;
        System.out.println ("A média das notas é: " + media);
        
        // notas maiores que 7
        System.out.print ("As notas maiores que 7: ");
        for (int i = 0;i <= notas.length-1;i++){
            int maior = 7;
            if (maior < notas[i]){
                maior = notas[i];
                System.out.print (maior + "  ");
            }
        }
        System.out.println ( );
        
        // maior nota
        int maxvalor = 0;
        for (int i = 0;i <= notas.length-1;i++){
            if (maxvalor < notas[i]){
                maxvalor = notas[i];
            }
        }
        System.out.println ("A maior nota é: " + maxvalor);
        
    }
}
