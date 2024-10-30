package monitor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  X x = new X();
    public static void main(String[] args) {
        X x = new X();
        ClientA clientA = new ClientA(x);
        ClientR clientR = new ClientR(x);
        clientR.start();
        clientA.start();

    }
}