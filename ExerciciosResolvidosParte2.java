/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2608;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class ExerciciosResolvidosParte2 {
    public static void main (String[] args){
    Scanner leia = new Scanner (System.in);
    //6 - Faca um programa que mostra os valores minimo e maximo suportados 
    //pelos tipos float e double.
    float f1 = Float.MAX_VALUE;
    float f2 = Float.MIN_VALUE;
    double d1 = Double.MAX_VALUE;
    double d2 = Double.MIN_VALUE;
    System.out.println("Exercício 6:");
    System.out.println("O valor máximo do Float é: " + f1);
    System.out.println("O valor mínimo do Float é: " + f2);
    System.out.println();
    System.out.println("O valor máximo do Double é: " + d1);
    System.out.println("O valor mínimo do Double é: " + d2);
    System.out.println();
    
    //7 - escreva um programa que solicita a temperatura em Celsius (ºC) 
    //e devolve ao usuario o valor convertido em Fahrenheit.
    System.out.println ("Exercício 7:");
    System.out.println ("Digite a temperatura em Celsius:");
    double tempc = leia.nextDouble();
    double tempf = (tempc * 1.8) + 32;
    System.out.println ("A temperatura em Fahrenheit é: " + tempf);
    System.out.println ();
    
    //8 - faca um programa que efetue o calculo do valor de uma prestação em atraso.
    // Entrada valor da prestação, o número de meses em atraso
    //e o percentual de juro. (juro simples)
    System.out.println ("Exercício 8:");
    System.out.println ("Digite o valor da prestação:");
    double prestacao = leia.nextDouble();
    System.out.println ("Digite o número de meses em atraso:");
    double meses = leia.nextInt();
    System.out.println ("Digite o percentual de juros por mês:");
    double porcento = leia.nextDouble();
    double prestacaoTotal = prestacao * meses;
    double juroFinal = (prestacaoTotal / 100) * porcento;
    double valorFinal = prestacaoTotal + juroFinal;
    System.out.println ("O valor a pagar agora é: " + valorFinal);
    System.out.println();
    
    //9 - faca um programa que solicite quantos km um carro faz por litro, 
    //a distancia a ser percorrida em uma viagem e o preço da gasolina.
    //O programa deverá calcular e informar quantos litros serão necessários para a viagem e o custo.
    System.out.println ("Exercício 9:");
    System.out.println("Digite o consumo em KM por litro do carro:");
    double consumo = leia.nextDouble();
    System.out.println("Digite a distancia da viagem:");
    double distancia = leia.nextDouble();
    System.out.println("Digite o preço da gasolina:");
    double gasolina = leia.nextDouble();
    double calculoLitros = distancia / consumo;
    double calculoCusto = calculoLitros * gasolina;
    System.out.println ("Serão necessários " + calculoLitros + " litros.");
    System.out.println ("O gasto total será de R$ " + calculoCusto);
    System.out.println();
    
    //10 - faca um programa que mostra a tebela verdade dos seguintes circuitos:
    //s = B e C ou A;
    //s = not B ou (C e A);
    //s = (A xor B) e C
    //faca o teste com A=V, B=F, C=V;
    
    System.out.println ("Exercício 10:");
    boolean a = true;
    boolean b = false;
    boolean c = true;
    boolean s1 = (b && c) || a;
    boolean s2 = !b || (c && a);
    boolean s3 = ((a ^ b) && c);
    System.out.println ("B e C ou A é: " + s1);
    System.out.println ("Negação de B ou (C e A) é: " + s2);
    System.out.println ("(A xor b)e C é: " + s3);
    System.out.println ( );
    }
}
