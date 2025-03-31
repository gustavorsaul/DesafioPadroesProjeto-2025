public class App {
    public static void main(String[] args) {
        Codificador cod = new Codificador(new strategy.CodificadorSimples());

        String aux = "Desafio Padrões de Projeto";

        //CodificadorSimples
        System.out.println(aux);
        aux = cod.codifica(aux);
        System.out.println(aux);
        aux = cod.deCodifica(aux);
        System.out.println(aux);
        System.out.println("\n");

        // CodificadorDesloca
        cod.setStrategy(new strategy.CodificadorDesloca());
        aux = cod.codifica("Desafio Padrões de Projeto");
        System.out.println(aux);
        aux = cod.deCodifica(aux);

    }
}
