package observer;

public class Main {

    public static void main(String[] args) {

        Subject subimp = new Subject(2);
        ObserverB b = new ObserverB(subimp);
        ObserverA a = new ObserverA(subimp);


        subimp.setState(8);
    }
}
