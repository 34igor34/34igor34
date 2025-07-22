package com.curso.basico;
import java.util. Scanner;

public class EntradaDados{
    public static void executar(Scanner sc) {
        String fraseCompleta;
        String x, y;
        int z;
        //Recebe valores de cada tipo separados por espaço
        System.out.println("Informe em sequencia duas palavra e um nunero inteiro");
        x = sc.next();
        y = sc.next();
        z = sc.nextInt();
        System.out.printf("%s, %s, %d%n", x, y, z);
        //Recebendo uma linha inteira
        //sc.nextLine() deve ser chamado para "limpar" resquícios de chamadas diferentes de sc.
        sc.nextLine();
        System.out.println("Insira uma frase completa");
        fraseCompleta = sc.nextLine();
        System.out.printf("A frase digitada foi: %s%n", fraseCompleta);
    }
}
