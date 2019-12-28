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
public class Matriz1 {
    public static void main (String[]args){
        // algoritmo que lê uma matriz 2 * 2, calcula e mostra
        // o maior elemento e a sua posição
        Scanner leia = new Scanner (System.in);
        int matriz [][] = new int [2][2];
        System.out.println ("Digite os valores:");
        for (int linha=0; linha<matriz.length; linha++){
            for (int coluna=0; coluna<matriz.length; coluna++){
                matriz [linha][coluna] = leia.nextInt();
            }
        }
        int maior = 0;
        int poslinha = 0, poscoluna = 0;
        for (int linha=0; linha<matriz.length; linha++){
            for (int coluna=0; coluna<matriz.length; coluna++){
                if (matriz[linha][coluna] > maior){
                    maior = matriz[linha][coluna];
                    poslinha = linha;
                    poscoluna = coluna;
                }
            }
        }
        System.out.println ("O maior número é " + maior);
        System.out.println ("E está na linha " + poslinha + " e na coluna " + poscoluna);
    }
}
