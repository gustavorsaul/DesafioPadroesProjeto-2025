public class validaFactory {
    public static validaStrategy criarValida(Tipo tipo) {
        switch (tipo) {
            case EMAIL:
                return new validaEmail();
            case INTEIRO:
                return new validaInteiro();
            case MATRICULA:
                return new validaMatricula();
            default:
                throw new IllegalArgumentException("Tipo de validador desconhecido: " + tipo);
        }
    }
    
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }
}