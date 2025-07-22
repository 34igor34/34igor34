package com.curso.basico;
public class FuncoesString{
    public static void executar() {
        String original = "abcd FGHIJ ABC abc DEFG    -";
        //precisamos de um vetor para podermos usar split
        String[] vetorString = original.split(" ");
        System.out.println(original);
        System.out.printf("Minusculos: %s%n", original.toLowerCase());
        System.out.printf("Maiusculas: %s%n ", original.toUpperCase());
        System.out.printf("Removendo espaços em branco em excesso: %s%n", original.trim());
        System.out.printf("Nova string a partir do item 2: %s", original.substring(2));
        System.out.printf("Nova string a partir do item 2 até o 9: %s", original.substring(2, 9));
        System.out.printf("Substituindo a por x: %s%n", original.replace("a", "x"));
        System.out.printf("Firts index de abcd: %s%n", original.indexOf("abcd"));
        System.out.printf("Ultimo Index de a: %s%n", original.lastIndexOf("a"));
        System.out.println("Vetor resultado do split: ");
        System.out.println("As strings formadas de split");
        for (int i = 0; i < vetorString.length; i++) {
            System.out.println(vetorString[0]);

        }
    }
}
