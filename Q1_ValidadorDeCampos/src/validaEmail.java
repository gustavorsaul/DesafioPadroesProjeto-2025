public class validaEmail implements validaStrategy{
    public boolean valida(String valor){
        int posicaoArroba = valor.indexOf("@");
        int posicaoPonto = valor.indexOf(".");
        return posicaoArroba > 0 && posicaoPonto > posicaoArroba;
    }
}