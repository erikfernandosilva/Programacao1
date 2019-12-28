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
public class Matriz4 {
    public static void main (String[]args){
        // escreva um algoritmo que leia uma matriz 3 * 3 e diga
        // se ela é simetrica.
        // matriz simetrica, A i,j = A j,i
        Scanner leia = new Scanner (System.in);
        int A [][] = new int [3][3];
        int inversa [][] = new int [3][3];
        System.out.println ("Digite os numeros da matriz:");
        for (int coluna=0; coluna <3; coluna++){
            for (int linha=0; linha<3; linha++){
                A[coluna][linha]= leia.nextInt();
            }
        }
        
        // exibição da matriz original
        System.out.println("A matriz original é: ");
        for (int coluna=0; coluna <3; coluna++){
            for (int linha=0; linha<3; linha++){
                System.out.print (A[coluna][linha] + " ");
            }
            System.out.println( );
        }
        
        // calculo de simetria
        int elementos = 0;
         for (int coluna=0; coluna <3; coluna++){
            for (int linha=0; linha<3; linha++){
                if (A[linha][coluna] == A[coluna][linha]){
                    elementos++;
                }
            }
        }
         
        System.out.println ( );
        // informar se é simetrica
        if (elementos == 9){
            System.out.println ("A matriz é simétrica.");
        }
        else {
            System.out.println ("A matriz não é simétrica.");
        }
    }
}
