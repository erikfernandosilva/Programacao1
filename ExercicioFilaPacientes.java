/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1111;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
 
public class ExercicioFilaPacientes {
    public static void main (String[]args){
        ArrayList<String> pacientes = new ArrayList();
        Scanner leia = new Scanner (System.in);
        int atendidos = 0;
        int posicaopreferencial = 0;
        while (true){
            System.out.println( );
            System.out.println("1 - inserir na fila");
            System.out.println("2 - atender - retirar da fila o primeiro");
            System.out.println("3 - mostrar posição de um paciente por nome");
            System.out.println("4 - quantidade de atendidos no dia");
            System.out.println("5 - cancelar atendimento por nome");
            System.out.println("6 - inserir preferencial");
            System.out.println("7 - mostrar toda fila");
            System.out.println("8 - passar paciente para o final da fila");
            System.out.println("Digite a opcao:");
        int escolha = leia.nextInt();
        switch (escolha){
            
            // inserir na fila
            case 1: {
                System.out.println ("Escreva o nome do paciente:");
                String nomepaciente = leia.next();
                pacientes.add (nomepaciente);
                System.out.println ("Paciente adicionado!");
                break;
            }
            
            // atender - retirar da fila o primeiro
            case 2: {
                pacientes.remove(0);
                atendidos++;
                System.out.println ("Paciente retirado com sucesso!");
                if (posicaopreferencial > 0){
                    posicaopreferencial--;
                }
                break;
            }
            
            // mostrar posição de um paciente por nome
            case 3: {
                System.out.println ("Escreva o nome que deseja pesquisar:");
                String pacientesearch = leia.next();
                System.out.print ("O paciente " + pacientesearch + " está na posição ");
                int pacienteposicao=(pacientes.indexOf(pacientesearch));
                System.out.println (pacienteposicao + 1);
                break;
            }
            
            // quantidade de atendidos no dia
            case 4: {
                System.out.println ("Foram atendidos " + atendidos + " pacientes.");
                break;
            }
            
            // cancelar atendimento por nome
            case 5: {
                System.out.println ("Escreva o nome que deseja cancelar:");
                String pacientedelete = leia.next();
                pacientes.remove (pacientedelete);
                System.out.println ("Atendimento cancelado!");
                break;
            }
            
            // inserir preferencial - insere no inicio, depois do ultimo preferencial
            case 6: {
                System.out.println ("Insira o preferencial: ");
                String preferencial = leia.next();
                pacientes.add (posicaopreferencial,preferencial);
                posicaopreferencial++;
                System.out.println ("Paciente adicionado!");
                break;
            }
            
            // mostrar toda fila
            case 7: {
                for (String s : pacientes){
                System.out.println (s);
                }
                break;
            }
            
            // passar paciente para o final da fila
            case 8: {
                System.out.println ("Digite o paciente que quer mover pro final da fila:");
                String pacientefinal = leia.next();
                pacientes.remove (pacientefinal);
                pacientes.add (pacientefinal);
                System.out.println ("Movido de posição com sucesso!");
                break;
            }
        }
    }
  }
}
