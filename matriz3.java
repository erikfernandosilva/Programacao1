/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2511;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class Matriz3 {
    public static void main (String[]args){
        // algoritmo que leia uma matriz 10 * 3 com notas de 10 alunos em 3 provas
        // mostrar a maior nota na primeira, segunda e terceira notas
        Scanner leia = new Scanner (System.in);
        int notas [][] = new int [10][3];
        for (int linha=0; linha<10; linha++){
            System.out.println ("Insira a nota do aluno " + linha);
            for (int coluna=0; coluna<3; coluna++){
                notas [linha][coluna] = leia.nextInt();
            }
        }
        int maior = 0;
        for (int coluna=0; coluna<3; coluna++){
            for (int linha=0; linha<10; linha++){
                if (notas[linha][coluna]>maior){
                    maior = notas[linha][coluna];
                }
            }
            System.out.println ("Na prova " + coluna + " a maior nota foi " + maior);
            maior = 0;
        }
    }
}
