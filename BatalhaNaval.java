/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1410;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class BatalhaNaval {
     public static void main (String args[]){
         /*
         Neste programa, de estilo batalha naval,
         o usuário vai informar o tamanho do array,
         e a probabilidade de navios em jogo.
         Depois, o usuário começa a atirar nos navios,
         e se acertar, o navio deve ser todo destruído.
         E deve mostrar quantos tiros foram disparados.
         */
         Scanner leia = new Scanner (System.in);
         System.out.println ("Bem vindo ao jogo de Batalha Naval!");
         System.out.println ("Comece falando o tamanho do tabuleiro:");
         int colunas = leia.nextInt();
         int linhas = colunas;
         boolean tabuleiro[][] = new boolean [linhas][colunas];
         System.out.println ("De 2 a 9, defina a quantidade de barcos:");
         int dificuldade = leia.nextInt();
         Random sorteador = new Random ();
         boolean continuar = true;
         int agua = 0;
         int acertos = 0;
         int escolha = 1;
         // condicional se o número for fora do escopo pedido
            while (dificuldade < 2 || dificuldade > 9){
                System.out.println ("Você inseriu um número não reconhecido!");
                System.out.println ("Insira um número de 2 a 9:");
                dificuldade = leia.nextInt();
            }
        // colocando os navios no tabuleiro
        // utilizando um random e a probabilidade informada pelo usuário
        System.out.println ("Estamos colocando os navios...");
         for (int linha = 0; linha < tabuleiro.length; linha++){
             for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++){
                if (sorteador.nextInt(10)>dificuldade){
                tabuleiro[linha][coluna] = true;
                }
                else{
                tabuleiro[linha][coluna] = false;
                }
             }
        }
        System.out.println ("Navios prontos!");
        
        //impressão do tabuleiro pronto
        /*
        for (int linha = 0; linha < tabuleiro.length; linha++){
             System.out.println ();
             for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++){
                 System.out.print (tabuleiro[linha][coluna]);
                 System.out.print(" ");
             }
         }
        */
        
        //nesta parte,acontece o jogo mesmo
        while (escolha == 1){
            System.out.println ("Digite a linha e a coluna que deseja atirar:");
            int tirolinha = leia.nextInt();
            int tirocoluna = leia.nextInt();
            // caso não tenha navios no lugar
            if (tabuleiro [tirolinha][tirocoluna]==false){
                System.out.println ("Água!");
                agua++;
                System.out.println ("Deseja continuar?");
                System.out.println ("Digite '1' para sim, ou '0' para não");
                escolha = leia.nextInt();
                }
            // caso tenha navio no lugar
            // está se pensando nos navios apenas na horizontal
            else{
                System.out.println ("Acertou!");
                acertos++;
                tabuleiro [tirolinha][tirocoluna]=false;
                int anterior = tirocoluna - 1;
                int posterior = tirocoluna + 1;
                boolean antesalvos = true;
                boolean depoisalvos = true;
                // o valor não pode ser menor do que zero então, limitamos ele
                if (anterior <= 0) {
                    antesalvos = false;
                }
                if (posterior >= linhas - 1){
                    depoisalvos = false;
                }
                // enquanto o anterior tiver navios
                    while(antesalvos = true){
                        if (anterior == 0) {
                                antesalvos = false;
                                break;
                        }
                        if (tabuleiro [tirolinha][anterior]=true){
                            tabuleiro [tirolinha][anterior]=false;
                            anterior--;
                            }
                        else{
                            antesalvos = false;
                            break;
                        }
                    }
                // enquanto o posterior tiver navios
                while (depoisalvos = true){
                    if (posterior >= linhas-1) {
                        depoisalvos = false;
                        break;
                        }
                        if (tabuleiro [tirolinha][posterior]=true){
                            tabuleiro [tirolinha][posterior]=false;
                            posterior++;
                        }
                    depoisalvos=false;    
                    }
                System.out.println ("Deseja continuar?");
                System.out.println ("Digite '1' para sim, ou '0' para não");
                escolha = leia.nextInt();
            }
        }
        System.out.println ("Fim de jogo!");
        System.out.println ("Você acertou " + acertos);
        System.out.println ("Você errou " + agua);
    }
}
