import java.util.List;
import java.util.OptionalInt;

public class VisualizadorDeMaiorValor implements Observer{

    private List<Integer> valores;

    public VisualizadorDeMaiorValor(List<Integer> valores){
        this.valores = valores;
    }

    @Override
    public void atualizar(List<Integer> valores) {
        exibeMaiorValor(valores);
    }

    public void defineValores(List<Integer> valores){
        this.valores = valores;
    }

    public void acrescentaValor(Integer valor){
        this.valores.add(valor);
    }

    public void exibeMaiorValor(List<Integer> valores){
        OptionalInt maiorValor = valores.stream()
            .mapToInt(Integer::intValue)
            .max();
        System.out.println("Maior valor: " + (maiorValor.isPresent() ? maiorValor.getAsInt() : "Nenhum valor encontrado") + ", quantidade de elementos analisados: " + valores.size());
    }

}
