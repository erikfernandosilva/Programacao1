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
public class Matriz2 {
    public static void main (String[]args){
        // programa para converter os elementos
        // de uma matriz 4 * 3 em um vetor
        Scanner leia = new Scanner (System.in);
        int matriz [][] = new int [4][3];
        int vetor [] = new int [12];
        int posvetor = 0;
        System.out.println ("Insira os valores:");
         for (int linha=0; linha<4; linha++){
            for (int coluna=0; coluna<3; coluna++){
                matriz [linha][coluna]=leia.nextInt();
            }
        }
        for (int linha=0; linha<4; linha++){
            for (int coluna=0; coluna<3; coluna++){
                vetor[posvetor] = matriz [linha][coluna];
                posvetor++;
            }
        }
        System.out.println ("Valores na matriz: ");
        for (int linha=0; linha<4; linha++){
            for (int coluna=0; coluna<3; coluna++){
                System.out.print (matriz [linha][coluna] + " ");
            }
            System.out.println ( );
        }
        System.out.println ("Convertido num vetor único: ");
        for (int i=0; i<vetor.length; i++){
            System.out.print (vetor[i] + " ");
        }
    }
}
