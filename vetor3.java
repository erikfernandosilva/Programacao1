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
public class Vetor3 {
    public static void main (String[]args){
        // algoritmo que le numeros inteiros, com respectivo tamanho
        // calcular e mostrar o numero de elementos pares lidos
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = leia.nextInt();
        int vetor[] = new int [tamanho];
        System.out.println ("Digite os valores do vetor:");
        for (int i=0; i<vetor.length; i++){
            vetor[i] = leia.nextInt();
        }
        System.out.println ("Valores lidos com sucesso");
        int numpares = 0;
        for (int i=0; i<vetor.length; i++){
            if (vetor[i]%2==0){
                System.out.println (vetor[i] + " é par");
                numpares++;
            }
        }
        System.out.println("Foram " + numpares + " números pares");
    }
}
