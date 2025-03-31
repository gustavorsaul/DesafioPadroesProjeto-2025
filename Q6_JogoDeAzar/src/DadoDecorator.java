import java.util.ArrayList;
import java.util.List;

public class DadoDecorator extends Dado{

    private Dado dado;
    private List<Integer> historico;

    public DadoDecorator(Dado dado) {
        super(dado.getValor());
        this.dado = dado;
        this.historico = new ArrayList<>();   
    }

    @Override
    public void rolar() {
        dado.rolar();
        historico.add(dado.getValor());
    }

    @Override
    public int getValor() {
        return dado.getValor();
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
