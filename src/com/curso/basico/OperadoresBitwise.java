public class OperadoresBitwise{
  public static void executar() {
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
}