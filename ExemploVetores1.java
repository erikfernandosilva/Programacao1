/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0209;

/**
 *
 * @author ferna
 */
// neste exemplo, vemos uma simples explicação sobre vetores

public class ExemploVetores {
    public static void main (String[] args){
        int idades[] = new int [5];
        idades [0] = 18;
        idades [1] = 12;
        idades [2] = 5;
        idades [3] = 9;
        idades [4] = 50;
        // vetores normalmente começam pelo número 0
        // e terminam em numero final subtraido de um
        // como no exemplo acima, de cinco espaços,
        // porém a inicial é 0 e a final é 4.
        
        System.out.println ("Posição [0] " + idades[0]);
        System.out.println ("Posição [1] " + idades[1]);
        System.out.println ("Posição [2] " + idades[2]);
        System.out.println ("Posição [3] " + idades[3]);
        System.out.println ("Posição [4] " + idades[4]);
        
        System.out.println ( );
        
        for (int i = 0; i < 5; i++){
            System.out.println ("posição[" + i + "]" + idades[i]);
        }
    }
}
