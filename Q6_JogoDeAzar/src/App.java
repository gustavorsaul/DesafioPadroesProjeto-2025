public class App {
    public static void main(String[] args) {
        
        Dado dadoSeis = new Dado(6);
        DadoDecorator dadoDecorator = new DadoDecorator(dadoSeis);

        dadoDecorator.rolar();
        dadoDecorator.rolar();

        System.out.println("Ultimo valor do Dado Seis: " + dadoDecorator.getValor());
        System.out.println("Histórico do Dado Seis: " + dadoDecorator.getHistorico());
        

    }
}
