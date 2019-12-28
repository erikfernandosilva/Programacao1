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
// exemplos simples com matrizes

public class Exemplo1Matrizes {
    public static void main (String[] args){
         // o primeiro colchete é o numero de linhas;
         // o segundo colchete é o numero de colunas;
         int matriz1 [][] = new int [2][3];
         
         matriz1 [0][0] = 1;
         matriz1 [0][1] = 2;
         matriz1 [0][2] = 3;
         
         matriz1 [1][0] = 4;
         matriz1 [1][1] = 5;
         matriz1 [1][2] = 6;
         
         System.out.println (matriz1 [0][0]);
         System.out.println (matriz1 [0][1]);
         System.out.println (matriz1 [0][2]);
         System.out.println (matriz1 [1][0]);
         System.out.println (matriz1 [1][1]);
         System.out.println (matriz1 [1][2]);
         
         System.out.print (matriz1 [0][0]);
         System.out.print (matriz1 [0][1]);
         System.out.print (matriz1 [0][2]);
         System.out.println();
         System.out.print (matriz1 [1][0]);
         System.out.print (matriz1 [1][1]);
         System.out.print (matriz1 [1][2]);
         
         System.out.println();
         System.out.println ("Utilizando a repetição em FOR:");
         // sistema repetição for que percorre as linhas
         for (int linha = 0; linha < 2; linha++){
             // repetição for que percorre as colunas
             for (int coluna = 0; coluna <3; coluna++){
                 System.out.println (matriz1[linha][coluna]);
             }
         }
         
         System.out.println ("Utilizando o For e o Length");
         // para matriz de qualquer tamanho, ou quando é muito grande...
         for (int linha = 0; linha < matriz1.length; linha++){
             System.out.println ();
             for (int coluna = 0; coluna < matriz1[linha].length; coluna++){
                 System.out.print (matriz1[linha][coluna]);
             }
         }
    }
}
