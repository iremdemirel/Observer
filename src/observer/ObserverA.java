package observer;

public class ObserverA extends Observer{

    public ObserverA(Subject subject){
        this.subject = subject;
        subject.attach(this);

    }

    public void notified(){
        System.out.println("A notified");
        int s = subject.getState();
        /*s...*/
    }


}
