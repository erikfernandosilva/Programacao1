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
// neste exemplo, vemos operadores de atribuição utilizados na forma compacta
// e exemplos de operadores logicos

public class Operadores {
    public static void main (String[] args){
        double valorCompra = 10;
        double desconto = 5;
        double valorFinal = 0;
        valorFinal = valorCompra - desconto;
        System.out.println (valorFinal);
        
        // operador de atribuição na forma compacta
        System.out.println(valorCompra-=desconto);
        
        double valorDesconto = valorCompra *= 0.05;
        System.out.println (valorDesconto);
        System.out.println (valorCompra);
        // a variavel valorCompra foi alterado permanentemente...
        
        //operadores Logicos
        // boolean é do tipo logico
        boolean internetDisponivel;
        boolean bancoDeDadosDisponivel;
        
        internetDisponivel = true;
        bancoDeDadosDisponivel = false;
        // corresponde ao E logico
        System.out.println (internetDisponivel & bancoDeDadosDisponivel);
        
        boolean semFioDisponivel;
        boolean caboDisponivel;
        caboDisponivel = true;
        semFioDisponivel = false;
        // corresponde ao OU logico
        System.out.println (caboDisponivel | semFioDisponivel);
        
        boolean aposentadoria = true;
        boolean valeFome = true;
        if (aposentadoria ^ valeFome){
            System.out.println("Pode receber Vale Transporte");
        }
        // corresponde ao OU EXCLUSIVO logico
        // apenas uma das partes pode ser verdadeira
        
        // negação retorna true se a expressao for false
        // feita colocando uma exclamação na frente da variavel
        // inverte o valor lógico da variavel a qual precede
        boolean amigoDono = false;
        System.out.println ("Não é amigo do dono " + !amigoDono);
        
        // diferença entre & e &&
        // diferença entre | e ||
        int count = 0;
        System.out.println ((3>5) & ++count == 1);
        System.out.println ("count" + count);
        
        /*
        a & b
        retorna true quando ambos a e b forem true, senão retorna false
        ambas a e b sao sempre avaliadas
        */
        
        /*
        a && b
        retorna true se a e b forem ambas true, senão retorna false
        b não é avaliado se a for false
        */
    }
}
