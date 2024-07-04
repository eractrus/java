
//class geral
public class MinhaClasse {
    // classe default principal
    public static void main(String[] args) {
        // lógica
        System.out.println("Iniciando em JAVA");

        // variável
        // Declaração de variável - tipo | nome | valor(opcional);
        String BR = "Brasil";

        // para uma variável ser imutável add a restrição final
        final String nome = "Desenvolvedor";

        System.out.println(nome);

        //chamando o método somar
        System.out.println(somar(1, 1));
    }
    
    // método
    // Declaração de método - tipoRetorno | nome (no infinitivo) | parâmentro
    public static int somar(int a, int b) {
        return a + b;
    }

    //JAVA BEANS
}
