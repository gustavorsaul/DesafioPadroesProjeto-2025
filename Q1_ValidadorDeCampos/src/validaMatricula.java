public class validaMatricula implements validaStrategy{
    public boolean valida(String valor){
        if(!new validaMatricula().valida(valor)){
            return false;
        }
        int sum=0;
        for(int i=0; i<valor.length()-1; i++){
            sum += Character.getNumericValue(valor.charAt(i));
        }
        int verifica = sum % 10;
        return verifica == Character.getNumericValue(valor.charAt(valor.length()-1));
    }
}