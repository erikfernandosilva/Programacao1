/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2907;
import java.util.Scanner;

/**
 *
 * @author ferna
 */
// neste programa de revisão, le-se dois numeros inteiros, se faz a soma
// e posteriormente, a exibição dos resultados

public class Revisao {
    public static void main (String[] args){
        int um,dois,result;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o primeiro número");
        um = leia.nextInt ();
        System.out.println ("Digite o segundo número");
        dois = leia.nextInt();
        result = um + dois; 
        System.out.println ("O valor da soma é:" + result);
    }
}
