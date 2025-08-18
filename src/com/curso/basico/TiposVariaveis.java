package com.curso.basico;
public class TiposVariaveis{
    public static void  executar() {
        /* Declarações de tipos primitivos: <tipo> <nome> = <valor> (é opcional);
         * Apesar de ser opcional, para ser utilizada a variável tem que possuir um valor.
         * São armazenadas na stack da memória RAM
         * Para receber vírgula ao invés de ponto Locale.setDefault(Locale.US)
         */
        byte bytes = 1; //8 bits de -128 a 127
        short comprido = 1200; // 16 bits
        boolean gay = false; // 1 bit
        char sexo = 'M'; // 16 bits também pode receber unicode '\uFFFF'
        long inteiroLongo = 12030102; //64 bits
        double maisPreciso = 1.72; // 64 bits um pouco mais preciso
        int idade = 25; // 32 bits
        //Por padrão todo ponto flutuante é double, 'f' converte para float
        float impreciso = 14.654676f; //32 bits pouco preciso
        String nome = "Igor"; //Não é primitivo maas sim um objeto
        int a, b;
        double resultado;

        System.out.printf("byte: %d%n", bytes);
        System.out.printf("short: %d%n", comprido);
        System.out.printf("boolean: %b%n", gay);
        System.out.printf("char: %c%n", sexo);
        System.out.printf("long: %d%n", inteiroLongo);
        System.out.printf("double: %.2f%n", maisPreciso);
        System.out.printf("Definindo 2 casas %.2f, adicionando inteiro %d, adicionando texto %s%n", impreciso, idade, nome);
        a = 5;
        b = 6;

        //Sem o casting double o compilador retorna um inteiro
        System.out.printf("5/6 resultado utilizando casting %f e resultado sem casting %d%n",((double) a / b), (a / b));
    }
}
