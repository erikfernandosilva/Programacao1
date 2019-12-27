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
// neste programa, mostra-se um exemplo de cast (conversão) de numerais

public class ExemploCast {
    public static void main (String[] args){
        double p = 23.3;
        int i = (int) p;
        System.out.println (i);
        /* exemplo de cast
        * neste caso, o numero double é convertido para inteiro,
        * resultando na possível perda de dados.
        */
        int j  = 0;
        System.out.println((double)j);
        // neste exemplo, o cast é feito de um inteiro pra um double.
    }
}
