/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1908;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class ExerciciosResolvidos {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    // 1 - faca um programa que solicita um numero inteiro e entao imprima o seu sucessor e antecessor. utilize o recurso de operadores unarios.
    // saida esperada:
    // valor digitado: 1
    // sucessor: 2
    // antecessor: 0
    System.out.println ("Exercício Número 1");
    System.out.println ("Digite um número inteiro:");
    int num =  leia.nextInt ();
    System.out.println ("Valor digitado:" + num++);
    System.out.println ("Sucessor:" + num--);
    System.out.println ("Antecessor:" + --num);
    System.out.println ( );
    
    // 2 - faca um programa que solicita um valor com casa decimal de precisao minima e mostre a sua parte inteira.
    System.out.println ("Exercício Número 2");
    System.out.println ("Digite um valor com casa decimal:");
    float num1 = leia.nextFloat();
    int i = (int) num1;
    System.out.println ("A parte inteira é: " + i);
    System.out.println ( );
            
    // 3 - faca um programa que solicita dois numeros flutuantes com precisao maxima e realiza e mostra o resultado das operacoes
    // de +,-,*,/, na forma compacta.
    System.out.println ("Exercício Número 3");
    System.out.println("Digite os dois valores com casas decimais:");
    double n2 = leia.nextDouble();
    double n3 = leia.nextDouble();
    double soma= n2;
    double menos = n2;
    double multi = n2;
    double divisao = n2;
    soma += n3;
    menos -= n3;
    multi *= n3;
    divisao /= n3;
    System.out.println ("Soma: " + soma);
    System.out.println("Subtração: " + menos);
    System.out.println("Multiplicação: " + multi);
    System.out.println("Divisão: " + divisao);
    System.out.println ( );
    
    // 4 - faca um programa que realiza a media entre dois numeros e arredonda para cima
    System.out.println ("Exercício Número 4");
    double media;
    System.out.println ("Digite os dois numeros para calculo da media:");
    double n4 = leia.nextDouble();
    double n5 = leia.nextDouble();
    media = ((n4+n5)/2);
    System.out.println("A média é: " + (Math.round(media)));
    System.out.println ( );
    
    // 5 - faca um programa que efetue e mostre o calculo do salario liquido
    // de um professor. os dados fornecidos serao: nome, valor da hora aula,
    // numero de aulas dadas no mes e percentual de desconto do INSS.
    // saida esperada:
    // professor:               joao
    // numero de aulas dadas:   10
    // valor da hora aula:      R$50,00
    // percentual de desconto:  10%
    // salario liquido:         R$450,00
    
    // P.S.: A formatação aparentemente só funcionou no exemplo específico
    // de saída esperada acima descrito.
    
    System.out.println ("Exercício Número 5");
    System.out.println ("Digite o nome do professor:");
    String nome = leia.next();
    System.out.println ("Numero de aulas dadas:");
    int aulas = leia.nextInt();
    System.out.println ("Digite o valor da hora aula:");
    double horaAula = leia.nextDouble();
    System.out.println ("Digite o desconto do INSS:");
    int inss = leia.nextInt();
    double salarioBruto = (horaAula * aulas);
    double desconto = ((salarioBruto / 100) * inss);
    double salarioLiquido = (salarioBruto - desconto);
    System.out.println ("Professor:" + (String.format("%20s",nome)));
    System.out.println ("Número de aulas dadas:" +(String.format("%6d",aulas)));
    System.out.println ("Valor da hora aula:" + (String.format("%13s","R$"+horaAula)));
    System.out.println ("Percentual de desconto:" + (String.format("%6s",inss + "%")));
    System.out.println ("Salário Líquido:" + (String.format("%17s","R$" + salarioLiquido)));
    }
}
