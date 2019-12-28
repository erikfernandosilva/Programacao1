/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1111;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
// exemplos simples de utilização de arrays dinamicos

public class ExemploArrayDinamico {
    public static void main (String[]args){
        // declaração de um array dinamico
        ArrayList<String> lista = new ArrayList();
        
        // adicionando strings ao array
        lista.add("Iverton");
        lista.add("Josa");
        lista.add("Jurema");
        lista.add("Bob");
        lista.add("Jertudres");
        lista.add("Fulana");
        
        // para saber o tamanho de um array
        System.out.println ("Tamanho lista " + lista.size());
        
        for (String s : lista){
            System.out.println (s);
        }
        
        System.out.println ("Devolve somente os dois primeiros: ");
        System.out.println (lista.subList(0,2));
        
        System.out.println ("Mostrar a posição de um item na lista: ");
        System.out.println (lista.indexOf("Bob"));
        
        System.out.println ("Substituir o número da posição 2: ");
        lista.set (2,"Felipe");
        for (String s : lista){
            System.out.println (s);
        }
        
        System.out.println ("Remover o segundo elemento: ");
        lista.remove(1);
        for (String s : lista){
            System.out.println (s);
        }
        
        System.out.println ("Removerr a Fulana da lista: ");
        lista.remove("Fulana");
        for (String s : lista){
            System.out.println (s);
        }
        
        System.out.println ("Remover o ultimo:");
        lista.remove(lista.size()-1);
        for (String s : lista){
            System.out.println (s);
        }
        
        System.out.println ("Verificar o Josa na lista");
        System.out.println (lista.contains("Iverton"));
    }
}
