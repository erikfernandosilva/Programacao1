/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0909;

/**
 *
 * @author ferna
 */
// um algoritmo de bubble sort, no qual um vetor desorganizado
// deve estar em ordem crescente

public class BubbleSort {
    public static void main (String[] args){
        int notas [] = {7,8,6,9,10};
        // organize em  ordem crescente, utilizando o Bubble Sort
        int auxiliar;
        
        System.out.println ("Desorganizado:");
        for(int i = 0; i<5; i++){
        System.out.println(" "+notas[i]);
        }
        
        for(int i = 0; i<5; i++){
          for(int j = 0; j < notas.length - 1; j++){
            if(notas[j] > notas[j + 1]){
                auxiliar = notas[j];
                notas[j] = notas[j+1];
                notas[j+1] = auxiliar;
            }
          }
        }
        
        System.out.println( );
        System.out.println("Organizado:");
        for(int i = 0; i<5; i++){
        System.out.println(" "+notas[i]);
        }
    }
}
