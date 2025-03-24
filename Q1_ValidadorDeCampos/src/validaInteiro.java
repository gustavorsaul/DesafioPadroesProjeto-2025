public class validaInteiro implements validaStrategy{
    public boolean valida(String valor){
    for (char c: valor.toCharArray()){
        if (!Character.isDigit(c)){
            return false;
        }
    }
    return true;
    }
}