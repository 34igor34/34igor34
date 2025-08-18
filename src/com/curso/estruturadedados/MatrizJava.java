package com.curso.estruturadedados;
import java.util.Scanner;
/* Definiçao: Matrix de valores, Vetor bidimensional, vetor de vetores
 *            Homogeneo, Ordenado, Alocado de uma vez so  
 * Vantagens: Acesso imediato aos seus elementos
 * Desvantagens: Tamanho fixo, dificuldad para inserir e remover dados
 */
public class MatrizJava {
    public static void executar(Scanner sc){
        System.out.print("Informe tamanho  coluna e linha da matrix: ");
        int line = sc.nextInt();
        int column = sc.nextInt();
        int[][] matriz = new int[line][column];
        for(int j = 0; j<line; j++){
            for(int i = 0; i<column; i++){
                matriz[j][i] = j+i; 
            }
        }
        for(int j = 0; j<matriz.length; j++){
            for(int i = 0; i<matriz[j].length; i++){
                System.out.printf("Posicao [%d][%d] = %d", j,i,matriz[j][i]);
            }
            
        }
        
    }
    
}