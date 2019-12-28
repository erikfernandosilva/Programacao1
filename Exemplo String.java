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
// neste exemplo, é mostrado uma serie de funcoes relacionadas as Strings

public class ExemploString {
    public static void main (String[] args){
        // forme frase com sorteados 
        String sorteado1 = "Joao";
        String sorteado2 = "Maria";
        String sorteado3 = "Jose";
        String sorteado4 = "Andre";
        String frase = String.join(",",sorteado1,sorteado2,sorteado3).concat(" e " + sorteado4);
        System.out.println ("Os sorteados na promoção foram: " + frase);
        
        // completa com " até fechar 10 caracteres
        System.out.println("Valor Cheque:");
        double valorCheque = 500.00;
        System.out.println(String.format("%-10s",valorCheque).replace(' ','"'));
        double valorCheque2 = 50000.00;
        System.out.println(String.format("%-10s",valorCheque2).replace(' ','"'));
        
        // remove espacos desnecessarios no incio e final da String
        String teste = " Meu texto ";
        System.out.println (teste.trim());
        
        // como remover varios espaços duplos de um texto
        String teste2 = " Meu texto está   maluco   ! ";
        teste2 = teste2.trim();
        while (teste2.contains("  "))
        {
            teste2 = teste2.replaceAll("  "," ");
        }
        System.out.println(teste2);
        
        // imprime o inteiro e se o comprimento menor que tres, preenche com 
        // zeros a esquerda, além disso, alinha entre duas barras. ex:|500|
        System.out.println(String.format("|%03d|",5));
        System.out.println(String.format("|%03d|",50));
        System.out.println(String.format("|%03d|",500));
        
        // imprime os digitos com dois numeros apos a casa decimal
        double PI = 3.1415;
        System.out.println (String.format("%.2f",5.4));
        System.out.println (String.format("%.2f",50.409));
        System.out.println (String.format("%.2f",500.0111));
        System.out.println(String.format("%.2f",PI));
        
        // imprime o inteiro e se o comprimento menor que tres, preenche com 
        // zeros a esquerda
        System.out.println(String.format("%03d",5));
        System.out.println(String.format("%03d",50));
        System.out.println(String.format("%03d",500));
        
        // imprime o inteiro, e se comprimento menor que tres digitos, preenche
        // a direita com espaços
        System.out.println(String.format("%-3d %s",5,"reais"));
        System.out.println(String.format("%-3d %s",50,"reais"));
        System.out.println(String.format("%-3d %s",500,"reais"));
        
        // preenche a esquerda com espaços se tiver menos de tres digitos
        System.out.println (String.format("%3d",5));
        System.out.println (String.format("%3d",50));
        System.out.println (String.format("%3d",500));
        
        // .toUpperCase transforma em maiscula.
        // .toLowerCase transforma em minuscula.
        String siglaPais1 = "br";
        String siglaPais2 = "Br";
        String siglaPais3 = "BR";
        System.out.println (siglaPais1.toUpperCase());
        System.out.println (siglaPais2.toUpperCase());
        System.out.println (siglaPais3.toLowerCase());
        
        // o nome completo, mas se quer saber apenas o primeiro nome
        // entao se usa o indexOf, pra saber a posição do espaco
        // primeiro nome é uma substring de nomeSobrenome
        // a seguir, o sistema exibe o primeiro nome
        String nomeSobrenome = ("Iverton Adao Da Silva Dos Santos");
        int posespaco = nomeSobrenome.indexOf(" ");
        String primeiroNome = nomeSobrenome.substring(0, posespaco);
        System.out.println ("Bem Vindo " + primeiroNome);
        
        // aqui ve-se o ultimo nome e depois mostra primeiro e ultimo nome
        // .lastIndexOf mostra o ultimo espaço do nome
        // depois, ele pega a posicao do ultimo espaço ate o final da string
        int posUltimoNome = nomeSobrenome.lastIndexOf(" ");
        String ultimoNome = nomeSobrenome.substring(posUltimoNome, nomeSobrenome.length());
        System.out.println ("Saudações " + primeiroNome + ultimoNome);
        
        // .equals diz se é igual as strings
        // .ignorecase ignora se é minuscula ou maiuscula.
        String nome = "Iverton Santos";
        System.out.println (nome.contains("Santos"));
        
        // o .contains avalia se há um conjunto de caracteres em certa string
        // o resultado é booleano, verdadeiro ou falso.
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a palavra que deseja buscar:");
        String texto = leia.next();
        System.out.println("Digite a letra que busca:");
        String busca = leia.next();
        System.out.println (texto.contains(busca));
    }
}
