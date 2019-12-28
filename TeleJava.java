/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1609;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class TeleJava {
    public static void main (String[] args){
    // faça um programa que sorteia 10 numeros
    // informe 3 numeros para jogar no TeleJava
    // se ganhar: "Você ganhou R$ 1.000.000,00, não esqueca do professor"
    // se perder: "Vai ter que ganhar a vida programando"
        int[] cartela = new int [10];
        
        for (int i = 0; i <= 9; i++){
            Random sorteador = new Random ();
            cartela [i] = sorteador.nextInt(99);
        }
        
        for (int i = 0; i < cartela.length; i++){
            System.out.println (cartela[i]);
        }
        
        Scanner leia = new Scanner (System.in);
        System.out.println ("Digite os tres numeros para jogar:");
        int num1 = leia.nextInt();
        int num2 = leia.nextInt();
        int num3 = leia.nextInt();
        
        int acertos = 0;
        for (int i = 0;i < cartela.length; i++){
            if (cartela[i] == num1){
                acertos++;
            }
            if (cartela[i] == num2){
                acertos++;
            }
            if (cartela[i] == num3){
                acertos++;
            }
        }
        if (acertos == 3){
            System.out.println ("Você ganhou R$ 1.000.000,00, não esqueca do professor");
        }
        else {
            System.out.println ("Vai ter que ganhar a vida programando");
        }
    }
}
