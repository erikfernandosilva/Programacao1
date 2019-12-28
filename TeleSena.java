/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3009;

import java.util.Random;

/**
 *
 * @author ferna
 */
public class TeleSena {
    public static void main (String[] args){
        // 1 - sortear uma cartela de 4 x 4
        // 2 - mostrar a cartela
        // 3 - sortear 6 numeros
        // 4 - se acertar 3 ou mais, ganha. Se não, perde.
        
        // criação da tabela e atribuição de valores
        int cartela [][] = new int [4][4];
        int acertos = 0;
        Random sorteador = new Random();
        for (int linha = 0; linha < cartela.length; linha++){
             for (int coluna = 0; coluna < cartela[linha].length; coluna++){
                int dados = (sorteador.nextInt(100));
                cartela[linha][coluna] = dados;
             }
        }
        
        // exibição da tabela já com os numeros atribuidos
        for (int linha = 0; linha < cartela.length; linha++){
             System.out.println ();
             for (int coluna = 0; coluna < cartela[linha].length; coluna++){
                 System.out.print (cartela[linha][coluna]);
                 System.out.print(" ");
             }
         }
        
        // sorteio dos seis numeros
         int numerosSorteados[] = new int [6];
         System.out.println ( );
         System.out.println ("Numeros sorteados:");
         for (int i=0; i<=5; i++){
             numerosSorteados[i] = sorteador.nextInt(100);
             System.out.println (numerosSorteados[i]);
         }
         
         // confere numeros sorteados com os da tabela
         for (int i:numerosSorteados){
             System.out.println ("Verificando o " + i);
             for (int linha = 0; linha <= 3; linha++){
                 for (int coluna =0; coluna <= 3; coluna++){
                     if (cartela[linha][coluna] == i){
                         System.out.println ("Acertou o " + i);
                         acertos++;
                     }
                 }
             }
         }
         
         if (acertos >= 3){
             System.out.println ("Acertou!");
         }
         else{
             System.out.println ("Mais sorte na próxima.");
         }
    }
}
