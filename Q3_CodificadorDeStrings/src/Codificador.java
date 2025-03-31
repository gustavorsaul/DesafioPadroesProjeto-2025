public class Codificador {
    private strategy.CodificadorStrategy strategy;

    public Codificador(strategy.CodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(strategy.CodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public String codifica(String str) {
        return strategy.codifica(str);
    }

    public String deCodifica(String str) {
        return strategy.deCodifica(str);
    }
}
