
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFFarroupilha
 */
public class SimuladorEstacionamento {
    public static void main (String args[]){
        /*
        1 - informar a posicao de cada carro
        2 - mostrar a quantidade de vagas livres
        3 - mostra o estacionametno com a posição de tds os carros
        4 - informa placa e sistema mostra a posição do carro
        5 - informar p-laca para retirar carro
        6 - mostrar o total arrecadado
        */
        String estacionamento[][]= new String[][]
        {
            {" "," "," "," "},
            {" "," "," "," "},
            {" "," "," "," "},
            {" "," "," "," "}
        };
         int linhaEst,colunaEst,opcaoEscolhida = 0;
         String placaCarro = " ";
         float totalArrecadado;
         
         Scanner leia = new Scanner (System.in);
         while (true){
             System.out.println("1 - informar a posicao de cada carro");
             System.out.println("2 - mostrar a quantidade de vagas livres");
             System.out.println("3 - mostra o estacionametno com a posição de tds os carros");
             System.out.println("4 - informa placa e sistema mostra a posição do carro");
             System.out.println("5 - informar p-laca para retirar carro");
             System.out.println("6 - mostrar o total arrecadado");
             
             System.out.println("Digite a opcao:");
             opcaoEscolhida = leia.nextInt();
             switch (opcaoEscolhida){
                 case 1 : {
                     System.out.println("Informe a linha e coluna para estacionar:");
                     linhaEst = leia.nextInt();
                     colunaEst = leia.nextInt();
                     while (!estacionamento[linhaEst][colunaEst].equals(" ")){
                         System.out.println("Vaga ocupada,informe outra");
                         System.out.println("Informe linha e coluna para estacionar:");
                         linhaEst = leia.nextInt();
                         colunaEst = leia.nextInt();
                     }
                     System.out.println("Informe a placa:");
                     placaCarro = leia.next();
                     estacionamento [linhaEst][colunaEst] = placaCarro;
                     System.out.println("Veículo armazenado com sucesso!");
                     break;
                 }
                 case 2 : {
                     int contaVagasLivres = 0;
                     int contaOcupadas = 0;
                     for (int linha = 0; linha <=3; linha++){
                         for (int coluna =0; coluna <= 3; coluna++){
                             if (estacionamento[linha][coluna].equals(" ")){
                                 contaVagasLivres++;
                             }
                             else{
                             contaOcupadas++;
                             }
                         }
                     }
                     System.out.println("Vagas livres: " + contaVagasLivres);
                     System.out.println("Vagas ocupadas: " + contaOcupadas);
                     break;
                 }
                 case 3 : {
                     for (int linha = 0; linha <=3; linha++){
                         for (int coluna =0; coluna <= 3; coluna++){
                             System.out.println(estacionamento[linha][coluna]);
                            }
                        }
                     break;
                    }
                 case 4 : {
                     String placaProcurada = "";
                     System.out.println("Informe a placa:");
                     placaProcurada = leia.next();
                     boolean encontrou = false;
                     for (int linha = 0; linha <=3; linha++){
                         if (encontrou){
                             break;
                         }
                         for (int coluna =0; coluna <= 3; coluna++){
                             if (estacionamento [linha][coluna].equals(placaProcurada)){
                                 System.out.println("Posição" + linha + " " + coluna);
                                 encontrou = true;
                                 break;
                             }
                         }
                     }
                     if (!encontrou){
                         System.out.println("Placa não encontrada!");
                     }
                 }
                 case 5 : {
                 
                 }
                 case 6 : {
                  
                 }
             }
         }
    }
}
