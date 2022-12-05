package softwareProject;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public boolean register(Observer observer) {
        observers.add(observer);
        return true;
    }

    public boolean unRegister(Observer observer) {
        observers.remove(observer);
        return true;
    }

    public abstract void notifyObservers();
}
