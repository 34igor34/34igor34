package com.curso.intermediario;
/*Toda classe possui um construtor por padrao
 *É chamado ao instanciar a classe [ConstrutorJava ex = new ConstrutorJava();]
 *Da valores padrões para as variaveis da classe Ex: nome=None, price=0, quantite=0, codigoDeLote=None 
 */
 public class ConstrutorJava{
     public String nome;
     private int price;
     private int quantite;
     private String codigoDeLote;
     
     public ConstrutorJava(){}
     
     public ConstrutorJava(String nome, int pric, int quantite, String codigoDeLote){
         this.nome = nome;
         this.price = price;
         this.quantite = quantite;
         this.codigoDeLote = codigoDeLote;
     }
     
     /*Metodos get e set podem adicionar metodos de validaçao e adicionar uma "segurança a mais"
      */
     public String getNome(){
         return this.nome;
     }
     public int getPrice(){
         return this.price;
     }
     public int getQuantite(){
         return this.quantite;
     }
     public void addQuantite(int num){
         this.quantite += num;
     }
     public String subQuantite(int num){
         if ((this.quantite - num) > 0){
             this.quantite -= num;
             return "Ok";
         } else{
             return "Valor maior que a quantidade atual";
         }
     }
     public void setNome(String nome){
         this.nome = nome;
     }
     
     @Override
     public String toString(){
         return "Nome:"+this.nome+"; preço:"+this.price+"; Quant: "+this.quantite+"; Lote:"+this.codigoDeLote;
     }
     
     public static void main(String[] args){
         ConstrutorJava construtor1 = new ConstrutorJava("teclado", 132, 10, "000001");
         ConstrutorJava construtor2 = new ConstrutorJava();
         System.out.printf("Construtor com todos os parametros preenchidos %s", construtor1.toString());
         System.out.printf("Construtor vazio: %s", construtor2.toString());
     }
 }