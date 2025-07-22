/* 
   Métodos devem SEMPRE pertencer a uma classe
   Padrão PascalCase em Classes
   Padrão camelCase: pacotes, méodos, atributos, 
variáveis e parâmetros
*/
import java.util.Scanner;
import com.curso.basico.*;

public class Main{
    static int contador = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiposVariaveis();
        EntradaDados.executar(sc);
        estruturaCondicional(sc);
        EscoposEstruturaDeControle();
        OperadoresBitwise();
        FuncoesString();
        EstruturasRepetitivas(sc);
        sc.close();
    }

    public static void TiposVariaveis() {
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
        resultado = (double) a / b;
        System.out.printf("Resultado: %.2f%n",resultado);
    }

    public static void EntradaDados(Scanner sc) {
        String fraseCompleta;
        String x, y;
        int z;
        //Recebe valores de cada tipo separados por espaço
        System.out.println("Informe duas palavra e um nunero inteiro");
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

    public static void estruturaCondicional(Scanner sc) {
        int a, b;
        //Comparações
        System.out.println("Informe dois números inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.printf("O numero %d é igual a  %d%n", a, b);
        } else if (a > b) {
            System.out.printf("O numero %d é maior que %d%n", a, b);
        } else {
            System.out.printf("O numero %d é maior que %d%n", b, a);
        }
        //outros comparativos: >= (maior igual)  <= (menor igual)  != (diferente de)

        //Expressão Lógicas: && (e) || (ou) !(não)
        if (a < 20 && a > -1) {
            System.out.printf("%d é menor que 20 mas não é negativo%n", a);
        }
        if (b > 15 || b < 0) {
            System.out.printf("%d é maior que 15 ou menor que 0%n", b);
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
        System.out.printf("Dia da semana: %s%n", diaDaSemana);
        System.out.print("Digite um caractere de seu sexo: ");
        char sexo = sc.next().charAt(0);
        switch (sexo) {
            case 'F':
                System.out.println("É fêmea");
                break;
            case 'M':
                System.out.println("É macho");
                break;
            default:
                System.out.println("Espere por atualizações");
        }


	/*Expressão Ternaria
	  (expressão) ? valor_se_verdadeiro : valor_se_falso;
	 */
        System.out.println("Informe um número: ");
        a = sc.nextInt();
        System.out.printf("%s%n", (a > 30) ? "maior que 30" : "menor que 30");
    }

    public static void EstruturasRepetitivas(Scanner sc) {
        int numerosDeEntrada = 0;
        int soma = 5;
        int tentativa;
        
        //Estrutura while exercício 01: continua ao usar o código certo
        System.out.println("Adicione um valor até acertar o código: ");
        int chute = sc.nextInt();
        int codigo = 2002;
        while (chute != codigo) {
	           System.out.printf("Incorreto! Você tem mais %d tentativa(s): %n", soma);
            tentativa = sc.nextInt();
	           soma -=1;
	           if (soma == 0){
		              System.out.println("Você não conseguiu descobrir o código");
		              break;
	           }
        }
	       if(chute == codigo){
	           System.out.println("Acertou o código era 2002");
	       }

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

        //*Estrutura for(início; condição; incremento){comandos...} | Usar quando quantidade total é conhecida
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
	
        soma = 0;
        do {
            System.out.println("Informe um número inteiro decimal para adicionar a contagem  e use zero para encerrar: ");
            numerosDeEntrada = sc.nextInt();
            soma += numerosDeEntrada;
        }   while (numerosDeEntrada != 0);
        System.out.println("Total :" + soma);
   
	/*Visão alternativa (inicio - primeiro loop() -> void; inicio todo loop condição() -> boolean ; final incremento() -> void)
         *Lembrando onde cada termo é chamado e o que aceita as possibilidades são infinitas.
         */
	       for (inicializa(); condicao(); incrementa()) {
            System.out.println("Executando: contador = " + contador);
        }
    }
        

    public static void inicializa() {
        contador = 1;
        System.out.println("Início: contador = " + contador);
    }

    public static boolean condicao() {
        return contador <= 5;
    }

    public static void incrementa() {
        contador++;
        System.out.println("Incremento: contador = " + contador);
    }



    public static void EscoposEstruturaDeControle() {
        //Cada estrutura de repetição possui um escopo próprio.
        double price = 34.5;

        //Estrutura de um while (enquanto) -> while(condição) {código;}
        while (price < 50) {
            System.out.printf("%.2f%n", price);
            price += 1.5;
        }

        //Executa pelo menos 1 vez, a condição é averiguada no final → do{codigo;}while(condicao);
        do {
            price -= price * 0.1;
        } while (price < 40);


        // -> for (inicio: void; condição: boolean; final: void){codigo;}
        for (double i = 0; i < price; i++) {
            System.out.printf("%f%n", i);
        }
    }

    public static void OperadoresBitwise() {
	/*Lógica: & "E"; | "OU"; ^ "OU-exclsivo"
	  0101 1001 & 0011 1100 = 0001 1000
          0101 1001 | 0011 1100 = 0111 1101
	            ^           = 0110 0101
	 */

        //0b indica que é um binario literal
        int intEmBinario = 0b00100000;
        int x1 = 89;
        int x2 = 60;
        System.out.println("32 em binário: " + intEmBinario);
        System.out.println(x1 & x2);
        System.out.println(x1 ^ x2);
    }

    public static void FuncoesString() {
        String original = "abcd FGHIJ ABC abc DEFG    -";
        //precisamos de um vetor para podermos usar split
        String[] vetorString = original.split(" ");
        System.out.println(original);
        System.out.printf("Minusculos: %s%n", original.toLowerCase());
        System.out.printf("Maiusculas: %s%n ", original.toUpperCase());
        System.out.printf("Removendo espaços em branco em excesso: %s%n", original.trim());
        System.out.printf("Nova string a partir do item 2: %s%n", original.substring(2));
        System.out.printf("Nova string a partir do item 2 até o 9: %s%n", original.substring(2, 9));
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
