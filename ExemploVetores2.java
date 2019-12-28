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
// outra explicação simples sobre vetores

public class Exemplo2Vetores {
    public static void main (String[] args){
        {
            double [] temperaturas =
            {16.3,6.8,3.5,10.5,50,25.2,10};
            
            System.out.println ("Tamanho do array: " + temperaturas.length);
            
            for (int i = 0; i < temperaturas.length; i++){
                System.out.println (temperaturas[i]);
            }
        }
    }
}
