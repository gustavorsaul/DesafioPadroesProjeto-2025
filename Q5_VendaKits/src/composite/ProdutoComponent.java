package composite;
public interface ProdutoComponent {

    int getId();
    String getNome();
    double getPreco();
    double getValorTotal(int quantidade);
}
