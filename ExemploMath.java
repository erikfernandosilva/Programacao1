/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0508;

/**
 *
 * @author ferna
 */
// neste programa, mostra-se algumas das funções do Math

public class ExemploMath {
    public static void main (String[] args){
        System.out.println ("Valor de pi é " + Math.PI);
        // valor de pi
        
        System.out.println (Math.sqrt(25));
        // raiz quadrada
        
        System.out.println (Math.pow(2,3));
        // potenciação
        
        System.out.println (Math.round(9.4));
        // arredondamento para cima ou para baixo,
        // se a parte decimal for maior ou menor que 0,5
        
        // pega a parte inteira menor
        System.out.println (Math.floor(3.9));
        
        System.out.println (Math.random());
        // valores randomicos entre 0 e 1
        
        System.out.println ((int)(Math.random()*100));
        // seleciona valores aleatorios de 0 a 100
        // pode se fazer com outros numeros, apenas mude pro numero desejado
        
        int x;
        if ((x = (int)(Math.random()*10)) > 5){
           System.out.println ("Você foi sorteado!" + x); 
        }
        else{
            System.out.println ("Você não foi sorteado...");
        }
    }
}
