/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula0209;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Atividade1 {
    public static void main (String[] args){
        //faça um array que leia 10 notas, depois exiba da seguinte forma:
        // as notas inseridas foram: 7,5 ... etc...
        double notas[] = new double [10];
        Scanner leia = new Scanner (System.in);
        for (int i = 0;i <= 9;i++){
            System.out.println ("Digite a nota:");
            notas[i] = leia.nextDouble();
        }
            System.out.println ("As notas inseridas foram:");
        for (int i = 0;i <= 9;i++){
            System.out.println (notas[i]); 
        }
    }
}
