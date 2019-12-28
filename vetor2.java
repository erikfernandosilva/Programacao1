/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2511;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Vetor2 {
    public static void main (String[]args){
        // algoritmo que leia 5 numeros inteiros e guarde os valores
        // a seguir imprima o conteúdo desse vetor
        Scanner leia = new Scanner (System.in);
        int vetor [] = new int [5];
        System.out.println ("Digite os valores:");
        for (int i=0; i<vetor.length; i++){
            vetor[i] = leia.nextInt();
        }
        System.out.println ("Valores armazenados:");
        for (int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
