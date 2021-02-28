package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    int state;
    private final List<Observer> observers = new ArrayList<>();


    public Subject(int state){
        this.state = state;
    }

    public void setState(int k){
        state=k;
        state_changed();
    }

    public int getState(){
        return state;
    }
    public void notify_observers(){

        for(int i=0; i<observers.size(); i++){
            observers.get(i).notified();
        }
    }

    public void state_changed(){
        notify_observers();
    }

    public void attach(Observer obs){
        observers.add(obs);
    }

    public void detach(Observer obs){
        observers.remove(obs);
    }

}
