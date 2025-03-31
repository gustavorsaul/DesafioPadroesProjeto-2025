public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        validaStrategy validador = validaFactory.criarValida(validaFactory.Tipo.EMAIL);

        if (validador.valida(email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }

        validador = validaFactory.criarValida(validaFactory.Tipo.INTEIRO);
        System.out.println(validador.valida("2340"));
    }
}