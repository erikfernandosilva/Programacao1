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
public class Vetor4 {
    public static void main (String[]args){
        // algoritmo que le dois vetores, X e Y, com 10 numeros cada
        // e um vetor Z que armazena a soma entre X e Y. Z1 = X1 + Y1
        Scanner leia = new Scanner (System.in);
        int X [] = new int [10];
        int Y [] = new int [10];
        int Z [] = new int [10];
        System.out.println ("Digite os números no primeiro vetor:");
        for (int i=0; i<X.length; i++){
            X[i] = leia.nextInt();
        }
        System.out.println ("Digite os números no segundo vetor:");
        for (int i=0; i<Y.length; i++){
            Y[i] = leia.nextInt();
        }
        for (int i=0; i<Z.length; i++){
            Z[i] = X[i] + Y[i];
        }
        System.out.println ("A soma dos vetores é:");
        for (int i=0; i<Z.length; i++){
            System.out.println ("A soma entre " + X[i] + " e " + Y[i] + " é: " + Z[i]);
        }
    }
}
