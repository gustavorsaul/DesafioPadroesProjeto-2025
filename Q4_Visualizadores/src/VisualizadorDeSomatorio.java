import java.util.List;

public class VisualizadorDeSomatorio implements Observer {
    private List<Integer> valores;

    public VisualizadorDeSomatorio(List<Integer> valores){
        this.valores = valores;
    }

    @Override
    public void atualizar(List<Integer> valores) {
        exibeSomatorio(valores);
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    public void exibeSomatorio(List<Integer> valores){
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: "+soma+", quantidade de elementos analisados: "+valores.size());
    }
}
