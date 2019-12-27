/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1208;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
// neste exemplo simples, temos a utilização de um scanner para ler um numero
// digitado pelo usuario, para posterior exibição na tela

public class ExemploScanner {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println ("Digite a idade");
        int valor = leitura.nextInt();
        System.out.println("Idade " + valor);
    }
}
