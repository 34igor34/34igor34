package com.curso.bascio;
import java.util.Scanner;

public class estruturaCondicional{
    public static void executar(Scanner sc) {
        int a, b;

        //Comparações
        System.out.println("Informe dois números inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.printf("O numero %d é igual a  %d", a, b);
        } else if (a > b) {
            System.out.printf("O numero %d é maior que %d", a, b);
        } else {
            System.out.printf("O numero %d é maior que %d", b, a);
        }
        //outros comparativos: >= (maior igual)  <= (menor igual)  != (diferente de)

        //Expressão Lógicas: && (e) || (ou) !(não)
        if (a < 20 && a > -1) {
            System.out.printf("%d é menor que 20 mas não é negativo", a);
        }
        if (b > 15 || b < 0) {
            System.out.printf("%d é maior que 15 ou menor que 0", b);
        }


        //Estrutura Switch-case
        System.out.println("Informe um numero que corresponda a um dia da semana: ");
        int num = sc.nextInt();
        String diaDaSemana;
        switch (num) {
            case 1:
                diaDaSemana = "Segunda";
                break;
            case 2:
                diaDaSemana = "Terça";
                break;
            case 3:
                diaDaSemana = "Quarta";
                break;
            case 4:
                diaDaSemana = "Quinta";
                break;
            case 5:
                diaDaSemana = "Sexta";
                break;
            case 6:
                diaDaSemana = "Sábado";
                break;
            case 7:
                diaDaSemana = "Domingo";
                break;
            default:
                diaDaSemana = "Dia inválido";
         }
        System.out.printf("Dia da semana: %s", diaDaSemana);
        System.out.print("Digite um caractere de seu sexo: ");
        char sexo = sc.next().charAt(0);
        switch (sexo) {
            case 'F':
                System.out.println("É fêmea");
            case 'M':
                System.out.println("É macho");
            default:
                System.out.println("Erro na Matrix");
        }


	/*Expressão Ternaria
	  (expressão) ? valor_se_verdadeiro : valor_se_falso;
	 */
        System.out.println("Informe um número: ");
        a = sc.nextInt();
        System.out.printf("%s", (a > 30) ? "maior que 30" : "menor que 30");
    }
}
