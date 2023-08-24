package GUI;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private String theString;
    private List<Observer> observers = new ArrayList<>();

    public Model() {
        theString = "";
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(theString);
        }
    }

    public void setString(String s) {
        theString = s;
        notifyObservers(); // Notify all observers of the change
    }

    public String getString() {
        return theString;
    }
}
