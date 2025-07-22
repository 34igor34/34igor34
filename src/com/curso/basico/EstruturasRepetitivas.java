package com.curso.basico;
import java.util.Scanner;

public class EstruturasRepetitivas{
    public static void executar(Scanner sc) {
        int soma = 0;
        int numerosDeEntrada;
        //Estrutura while exercício 01: continua ao usar o código certo
        System.out.println("Adicione um valor até acertar o código: ");
        int tentativa = sc.nextInt();
        int codigo = 2002;
        while (tentativa != codigo) {
            tentativa = sc.nextInt();
        }
        System.out.println("Acertou o código era 2002");

        //01: Quadrante do plano cartesiano
        System.out.println("Informe 2 coordenadas para saber em qual quadrante se encaixa: ");
        int coordenadaA = sc.nextInt();
        int coordenadaB = sc.nextInt();
        while (coordenadaA != 0 || coordenadaB != 0) {
            if (coordenadaA > 0 && coordenadaB > 0) System.out.println("Primeiro Quadrante");
            if (coordenadaA < 0 && coordenadaB > 0) System.out.println("Segundo Quadrante");
            if (coordenadaA < 0 && coordenadaB < 0) System.out.println("Terceiro Quadrante");
            if (coordenadaA > 0 && coordenadaB < 0) System.out.println("Quatro Quadrante");
            System.out.println("Informe 2 coordenadas para saber em qual quadrante se encaixa: ");
            coordenadaA = sc.nextInt();
            coordenadaB = sc.nextInt();
        }

        //*Estrutura for(início; condição; incremento){comandos...} | Usar quando quantidade total é conhecidaGIT
        for (int i = 0; i < 60; i++) {
            System.out.println(i);
        }
        /*O for pode ser visto como (inicio() -> void; condição() -> boolean; incremento() -> void)
         *Lembrando onde cada termo é chamado e o que aceita as possibilidades são infinitas.
         */
         
        do {
            System.out.println("Informe um número inteiro decimal para adicionar a contagem que seja diferente de zero: ");
            numerosDeEntrada = sc.nextInt();
            soma += numerosDeEntrada;
        }   while (numerosDeEntrada != 0);
        System.out.println("Total :" + soma);
    }

}    
