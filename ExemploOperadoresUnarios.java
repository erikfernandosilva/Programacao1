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
// neste programa, mostra-se exemplos de incrementos e decrementos unarios
// tanto em sua forma pré como pós

public class ExemploOperadoresUnarios {
    public static void main (String[] args){
        // operadores unarios trabalham com apenas um valor.
        // pos incremento unario
        // primeiro o valor da variavel é utilizada
        // e apos o incremento é utilizada
        int posIncUn = 10;
        posIncUn++;
        System.out.println(posIncUn);
       
        System.out.println(posIncUn++);
        System.out.println(posIncUn);
        
        // pre incremento unario
        // primeiro executa o incremento e depois chama a função
        int preIncUn = 10;
        System.out.println(++preIncUn);
        System.out.println(preIncUn);
        
        // 
        int numTentativas = 2;
        if (++numTentativas == 3){
            System.out.println("Explode a bomba!");
        }
        
        //o mesmo é disponível para pré decremento e pos decremento
        
        // pos decremento unario
        int posDecUn = 9;
        System.out.println (posDecUn--);
        System.out.println (posDecUn);
        
        // pre decremento
        int preDecUn = 9;
        System.out.println (--preDecUn);
        System.out.println (preDecUn);
    }
}
