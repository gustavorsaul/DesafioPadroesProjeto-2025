package composite;

import java.util.ArrayList;
import java.util.List;

public class ProdutoKit implements ProdutoComponent {

    private int id;
    private String nome;
    private List<ProdutoComponent> componentes = new ArrayList<>();

    public ProdutoKit(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarProduto(ProdutoComponent produto) {
        componentes.add(produto);
    }

    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (ProdutoComponent componente : componentes) {
            total += componente.getPreco();
        }
        return total * 0.9;
    }

    @Override
    public double getValorTotal(int quantidade) {
        return getPreco() * quantidade;
    }

}
