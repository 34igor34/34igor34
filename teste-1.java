/* 
   *Metodos devem SEMPRE pertencer a uma classe
   M*etodos soltos não funcionam, tudo em java está dentro de uma classe
   Padrao CamelCase em ClassesJava
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        /* 
	* Declarações de tipos primitivos: <tipo> <nome> = <valor> (é opcional);
        * São armazenadas na stack da memória RAM 
	*/
		byte bytes = 1; //8 bits de -128 a 127
		short comprido = 1200; // 16 bits
		int idade = 25; // 32 bits       
		long inteiroLongo = 12030102; //64 bits
		//Para receVber ponto flutuante com virgula ao invesde ponto Locale.setDefault(Locale.US)
		//Ponto flutuante é double por padrao usar 'f' quando quiser que seja double
		float impreciso = 14.654676f; //32 bits pouco preciso
		double maisPreciso = 1.72; // 64 bits um pouco mais preciso
		char sexo = 'M'; // 16 bits tambem pode receber unicode '\uFFFF'
		String nome = "Igor";
		boolean gay = false; // 1 bit				
		System.out.println("Començando com uma quebra de lina");
		System.out.printf("Definindo  duas casas decimais %.2f e adicionado quebra de linha %n", impreciso);
		System.out.printf("Definindo  4 casas decimais %.4f e adicionado quebra de linha %n", impreciso);
		//podemos contenar usando + porém este modo é mais eficiente
		System.out.printf("Definindo 2 casas %.2f, adicionando inteiro %d, adicionando texto %s%n", impreciso, idade, nome);
		
		//Operações aritmeticas
		int a, b;
		double resultado;
		a = 5;
		b = 6;

		//Sem o casting double o compilador retorna um inteiro
		resultado = (double) 5/6;
		System.out.println(resultado);
		Main.EntradaDados();
	}

	public static void EntradaDados(){
		Scanner sc = new Scanner(System.in);
		String fraseCompleta;
		String x,y;
		int z;
		//Recebe apenas os primeros valores de cada tipo até o espaço
		System.out.println("Informe uma palavra, um nunero inteiro e um inteiro em sequencia");
		x = sc.next();
		y = sc.next();
		z = sc.nextInt();
		System.out.printf("%s, %s, %d%n", x,y,z);
		//Recebendo uma linha inteira
		System.out.println("Insira uma frase completa");
		//Se algum metodo de entrada for chamado antes do nextLinr, a funcao deve ser chamada antes para "limpar" resquicios.
		sc.nextLine();
		fraseCompleta = sc.nextLine();
		System.out.printf("A frase digitada foi: %s%n", fraseCompleta);
		sc.close();	    
	}

    public static void estruturaCondicional(){
	int a, b;
	Scanner sc = new Scanner(System.in);
	
	//Comparações
	System.out.println("Informe dois numeros inteiros: ");
	a = nextInt();
	b = nextInt();
	if (a == b){
	    System.ou.printf("O numero %d é igual a  %d", a,b);7
	}else if (a>b){
	    System.ou.printf("O numero %d é maior que %d", a,b);}
	    else if(b<a){
		System.ou.printf("O numero %d é maior \
que %d", b,a);
	    }
	/*outros comparativos:
	  >= (maior igual)  <= (menor igual)  != (diferente de) 
	 */

	/*Expressao Logicas
	  && (e) || (ou) !(nao)
	 */
	if (a<20 && a > -1 ){
	    System.out.printf("%d é menor que 20 mas não é negativo", a);
	}
	if (b > 15 || b < 0){
	    System.out.printf("%d é maior que 15 ou menor que 0", b);
	}

	/*Estrutura Condiciona, "if" ja foi apresentado*/
	//Estruturs Switch-case
	int diaDaSemana;
	diaDaSemana = sc.nextInt();
	switch(diaDaSemana){
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
	    diaDaSemana = "Dia invalido";
	    break;
	}
	System.out.printf("Dia da semana: %s", diaDaSemana);

	char sexo = "F";
	switch(sexo){
	case "F":
	    System.out.println("É fêmea");
	case "M":
	    System.out.println("É macho");
	default:
	    System.out.println("Erro na Matrix");
	}


	/*Expressão Ternaria
	  (expressão) ? valor_se_verdadeiro : valor_se_falso;
	 */
	System.out.printf("%s", (121 > 30) ? "maior que 30" : "menor que 30");

	
	
	sc.close();
    }
    public static void EscoposEstruturaDeControle(){
	//Cada estrutura de repetição possui um escopo próprio 
	double price = 34.5;

	    
	  
    }
}

