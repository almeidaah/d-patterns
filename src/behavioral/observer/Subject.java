package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private List<Observer> observers = new ArrayList();
    private int state;

    public void add(Observer o){
        observers.add(o);
    }

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        execute(); //this is the point where all observers are notified
    }

    private void execute(){
        observers.forEach( observer -> {
           observer.update();
        });
    }
}
