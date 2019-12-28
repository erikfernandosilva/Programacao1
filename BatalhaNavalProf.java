/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2110;
import java.util.Scanner;
/**
 *
 * @author ferna
 */
public class BatalhaNaval {
    static String mar[][] = {
        {"-","-","-","b"},
        {"b","b","b","b"},
        {"-","-","-","b"},
        {"-","-","-","b"}
    };
   
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int posLinha, posColuna;
       
        for(int tentativa=0; tentativa < 3; tentativa++){
            System.out.print("Digite a posição em x: ");
            posLinha = leitura.nextInt();
            System.out.print("Digite a posição em y: ");
            posColuna = leitura.nextInt();
           
            explode(mar, posLinha, posColuna);
           
            for(int linha=0; linha <= 3; linha++){
                System.out.println();
                for(int coluna=0; coluna <= 3; coluna++){
                    System.out.print(mar[linha][coluna]);
                }
            }
            System.out.println();
           
        }
    }
   
    public static boolean explode(String[][]m, int linha, int coluna){
        if(linha <= 3 & coluna <= 3 & linha >=0 & coluna >=0){
            if(m[linha][coluna].equals("b")){
                m[linha][coluna] = "X";
                explode(m, linha, coluna+1);
                explode(m, linha, coluna-1);
                explode(m, linha+1, coluna);
                explode(m, linha-1, coluna);
            }
            return true;
        }
        return true;
    }
}
