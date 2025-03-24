import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var vm = new VisualizadorDeMedia(dados.getValores());
        var vs = new VisualizadorDeSomatorio(dados.getValores());
        var vmv = new VisualizadorDeMaiorValor(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            System.out.println("=>  0 = fim");
            System.out.println("=> -1 = ligar visualizador de somatório");
            System.out.println("=> -2 = ligar visualizador de média");
            System.out.println("=> -3 = ligar visualizador de maior valor");
            System.out.print("=> ");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            } else if (valor == -1) {
                dados.addObserver(vs);
                System.out.println("Visualizador de somatório ligado!");
            } else if (valor == -2) {
                dados.addObserver(vm);
                System.out.println("Visualizador de média ligado!");
            } else if (valor == -3) {
                dados.addObserver(vmv);
                System.out.println("Visualizador de maior valor ligado!");
            } else{
                dados.add(valor);
            }
        }
        System.out.println("Fim");
    }
}
