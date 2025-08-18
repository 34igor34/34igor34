package com.curso.basico;
import com.curso.intermediario.ConstrutorJava;
//tipo referencia(ponteiros) sao armazenados no stack(pilha), tipos primitovo/valor sao armazenados no heap (dinamica)
public class Memoria {
    public static void executar(){
        //Ambos apontam para o mesmo espaço de memoria,ou seja, ambos representam a mesma coisa
        ConstrutorJava produto, teste;
        produto = new ConstrutorJava("teclado", 132, 10, "000001");
        teste = produto;
        System.out.printf("Dados de produto: %s\nDados da variavel teste: %s", produto.toString(), teste.toString());
        
        //Agora a variavel nao aponta para nada
        teste = null;
        
        //Depois de alocar(new)todos apenas os atributos da classe recebem valores padrão (variaveis em metodos nao recebem valor padrao)
        teste = new ConstrutorJava();
        System.out.printf("Classe iniciada vazia ", teste.toString());
        
        //Garbage Collector -> gerencia a area do heap(dinamico) e desalocando o que na estiver sendo utilizado
        
        //Desalocaçao por escopo ===> fora de escopo (metodos tambem contam) é apagado
        if(!false){
            int numeroFaltas = 14;
        }
    }
}