/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1811;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class SistemaVotacao {
    public static void main (String[]args){
        // neste exercício, pede-se a criação de um sistema de votação,
        // nesse código,forma três arrays: um array para o nome dos candidatos,
        // o segundo, um ArrayList para a contabilização dos votos,
        // e um terceiro, para reunião dos votos por candidatos
        // além disto, o programa exibe ao final o total geral de votos,
        // o total individual, e o candidato mais votado
        
        // lista que vai armazenar os votos
        ArrayList<Integer> votos = new ArrayList();
        Scanner leia = new Scanner (System.in);
        
        // informar numero e nome dos candidatos
        System.out.println ("Informe quantos candidados são: ");
        int numcandidatos = leia.nextInt();
        // criação da lista de candidatos e de resultados
        String candidatos[] = new String [numcandidatos];
        Integer resultado[] = new Integer [numcandidatos];
            for (int i = 0; i < numcandidatos; i++){
                System.out.println("Informe o nome do candidato de numero " + i);
                candidatos [i] = leia.next();
            }
        
        // sistema de votação
        while (true){
        System.out.println ("Informe o login e senha: ");
        String login = leia.next();
        int senha = leia.nextInt();
        if (login .equals("adm")){
            if (senha == 123){
            System.out.println ("Digite o numero do candidato que deseja votar");
            for (int i = 0; i < numcandidatos; i++){
                System.out.println (candidatos[i] + " numero: " + i);
            }
            int votoindividual = leia.nextInt();
            votos.add (votoindividual);
            System.out.println ("O seu voto foi guardado com sucesso.");
            }
            else {
                System.out.println ("Senha incorreta, reinicie e tente novamente.");
            }
        }
        else {
            System.out.println ("Login incorreto,reinicie e tente novamente.");
        }
            System.out.println ("Deseja continuar? s/n");
            String resposta = leia.next();
            if (resposta.equals("n")){
                break;
            }
        }
        // inicializando array resultados em zero
        for (int i = 0; i < resultado.length; i++){
            resultado[i] = 0;
        }
        
        //apuração dos votos
        for (int i = 0; i < votos.size(); i++){
            int vote = votos.get (i);
            for (int k = 0; k < candidatos.length; k++){
            if (vote == k){
                resultado[k]++;
            }
        }
        }
        
        // total de votos
        int votostotais = 0;
        for (int i = 0; i < resultado.length; i++){
            votostotais += resultado[i];
        }
        System.out.println ("Foram contabilizados " + votostotais + " votos");
        
        // exibição dos resultados por candidato
        System.out.println ("O resultado da eleição foi:");
        for (int l = 0; l < candidatos.length; l++){
            System.out.println ("Candidato " + l +" "+ candidatos[l] +" "+ resultado[l] + " votos");
        }
        
        // candidato mais votado
        int maisvotos = 0;
        for (int i = 0;i < resultado.length; i++){
            if (maisvotos<resultado[i]){
                maisvotos = resultado[i];
            }
        }
        System.out.println ("O mais votado teve " + maisvotos + " votos");
    }
}
