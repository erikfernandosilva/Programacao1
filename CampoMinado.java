/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0710;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class CampoMinado {
    public static void main (String[] args){
        // criar uma copia de campo minado
        // criar uma matriz de 4 * 4
        // o usuario deve informar a posição pra qual deseja pular
        // se não explodir, deve somar a um contador de acertos
        // as bombas são booleanas
        // se tem bomba = true
        boolean campo [][] = new boolean [4][4];
        Random aviao = new Random();
        int acertos = 0;
        boolean vivo = true;
        Scanner leia = new Scanner (System.in);
        
        // colocando as bombas no campo
        // utilizando um sistema de estatísticas de 30% de chance de bomba
        System.out.println ("O avião está colocando as bombas no campo...");
         for (int linha = 0; linha < campo.length; linha++){
             for (int coluna = 0; coluna < campo[linha].length; coluna++){
                if (aviao.nextInt(10)>7){
                campo[linha][coluna] = true;
                }
                else{
                campo[linha][coluna] = false;
                }
             }
        }
        System.out.println ("Bombas colocadas e armadas!");
        
        // exibição da tabela já com as bombas
       /*
        for (int linha = 0; linha < campo.length; linha++){
             System.out.println ();
             for (int coluna = 0; coluna < campo[linha].length; coluna++){
                 System.out.print (campo[linha][coluna]);
                 System.out.print(" ");
             }
         }
        */
        
        // a parte do jogo
        while (vivo == true){
            System.out.println ("Digite a linha e a coluna em que deseja pular:");
            int linha = leia.nextInt();
            int coluna = leia.nextInt();
            if (campo[linha][coluna]==false){
                System.out.println("Limpo!");
                acertos++;
            }
            else{
                vivo = false;
                System.out.println ("Explodiu!");
                System.out.println ("Voce acertou " + acertos + " vezes");
                break;
            }
        }
    }
}
