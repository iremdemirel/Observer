package observer;

public class ObserverB extends Observer{

    public ObserverB(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void notified(){
        System.out.println("B notified");
        int s = subject.getState();
        /*s...*/
    }
}
