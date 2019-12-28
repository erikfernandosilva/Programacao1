/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2511;

/**
 *
 * @author ferna
 */
public class Vetor1 {
    public static void main (String[]args){
        // programa que declara um vetor M com 6 elementos inteiros
        // deve ser inicializado com valores de 1 até 6
        int M [] = new int [6];
        int num = 1;
        for (int i=0; i<M.length; i++){
            M[i] = num;
            num++;
        }
        System.out.println("Valores no vetor:");
        for (int i=0; i<M.length; i++){
            System.out.println(M[i]);
        }
    }
}
