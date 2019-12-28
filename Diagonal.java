/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3009;

/**
 *
 * @author ferna
 */
public class Diagonal {
     public static void main (String[] args){
         int matriz1 [][] = new int [3][3];
         matriz1 [0][0] = 1;
         matriz1 [0][1] = 2;
         matriz1 [0][2] = 3;
         
         matriz1 [1][0] = 4;
         matriz1 [1][1] = 5;
         matriz1 [1][2] = 6;
        
         matriz1 [2][0] = 7;
         matriz1 [2][1] = 8;
         matriz1 [2][2] = 9;
         
        // essa repetição pega os numeros da diagonal de uma tabela
        for (int linha = 0; linha < matriz1.length; linha++){
             for (int coluna = 0; coluna < matriz1[linha].length; coluna++){
                 if (linha == coluna){
                     System.out.println (matriz1[linha][coluna]);
                }
             }
         }
     }
}
