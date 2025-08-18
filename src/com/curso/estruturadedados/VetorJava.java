package com.curso.estruturadedados;
import java.util.Scanner;
public class VetorJava {
    static void executar(Scanner sc){
        int tamanho;
        System.out.println("Na programaçao 'vetor' é a representaçao de um arranjo(array) unidemensional");
        System.out.println(" ---> Homogênea (apenas um tipo); Ordenado (alocados em posições); Tamanho fixo");
        System.out.println("");
        System.out.println(" -------------------- VANTAGES -------------------- ");
        System.out.println(" ---> Acesso imediato atraves de seus indices");
        System.out.println(" -------------------- DESVANTAGES -------------------- ");
        System.out.println(" ---> Tamanho fixo");
        System.out.println(" ---> Dificuldade para adicionar ou remover itens");
        System.out.println("");
        System.out.println("Declaração: <tipo>[] <nome_variavel> = new <tipo> [<tamanho>] {componentes do vetor --opcional}");
        System.out.println("Para exemplificar o funcionamento, informe o tamanho do vetor que dseja: ");
        tamanho = sc.nextInt();
        int[] vetor = new int [tamanho];
        int[] vetorInicioPreenchido = new int [] {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Agora vamos povoar esse vetor com valores inteiros:");
        for(int aux = 0; aux<tamanho; aux++){
            System.out.println("Informe um número inteiro: ");
            vetor[aux] = sc.nextInt();
        }
    }
    
}