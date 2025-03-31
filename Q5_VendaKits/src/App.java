import java.util.List;
import composite.*;

public class App {
    public static void main(String[] args) {

        VendasFachada proc1 = new VendasEmMemoria();
        List<ProdutoComponent> produtos1 = proc1.buscarProdutos();
        Venda venda1 = proc1.iniciarVenda();

        proc1.registrarVenda(venda1, produtos1.get(0).getId(), 1);
        proc1.registrarVenda(venda1, produtos1.get(1).getId(), 2);

        System.out.println("----------");
        System.out.println(proc1.emitirComprovante(venda1));
        System.out.println("----------");

        ProdutoUnidade p1 = new ProdutoUnidade(4, "TV", 2000);
        ProdutoUnidade p2 = new ProdutoUnidade(5, "NOTEBOOK", 3000);

        ProdutoKit kit1 = new ProdutoKit(6, "KIT ELETRONICOS");
        kit1.adicionarProduto(p1);
        kit1.adicionarProduto(p2);
    
        proc1.adicionarProduto(p1);
        proc1.adicionarProduto(p2);
        proc1.adicionarProduto(kit1);

        List<ProdutoComponent> produtos2 = proc1.buscarProdutos();

        Venda venda2 = proc1.iniciarVenda();

        proc1.registrarVenda(venda2, p1.getId(), 1);
        proc1.registrarVenda(venda2, p2.getId(), 1);
        proc1.registrarVenda(venda2, kit1.getId(), 2);

        System.out.println(proc1.emitirComprovante(venda2));
        System.out.println("----------");
    }
}
