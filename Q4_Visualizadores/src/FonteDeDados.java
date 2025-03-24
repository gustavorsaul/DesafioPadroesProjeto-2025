import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observer> observers = new ArrayList<>();

    public FonteDeDados(){
        lst = new LinkedList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificaObserver(value);
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    private void notificaObserver(int valor) {
        for (Observer observer : observers) {
            observer.atualizar(valor);
        }
    }
}