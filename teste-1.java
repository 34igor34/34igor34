/* 
   *Metodos devem SEMPRE pertencer a uma classe
   M*etodos soltos não funcionam, tudo em java está dentro de uma classe
   Padrao CamelCase em ClassesJava
*/
import java.util.Scanner;

class Main {
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
		System.out.println("Definindo  duas casas decimais %.2f e adicionado quebra de linha %n", impreciso);
		System.out.println("Definindo  4 casas decimais %.4f e adicionado quebra de linha %n", impreciso);
		//podemos contenar usando + porém este modo é mais eficiente
		System.out.printf("Definindo 2 casas %.2f, adicionando inteiro %d, adicionando texto %s", impreciso, idade, nome);
		
		//Operações aritmeticas
		int a, b;
		double resultado;
		a = 5;
		b = 6;

		//Sem o casting double o compilador retorna um inteiro
		resultado = (double) 5/6
	}

	public static void EntradaDados(){
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Informe o nome do arquivo: ");
		x = sc.next();

		sc.close();

	}

}

