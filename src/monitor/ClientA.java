package monitor;


public class ClientA extends Thread {

   private X x;
    public ClientA(X x) {
        this.x = x;
    }
    @Override
    public void run() {
        x.liberer();
        System.out.println("Client A a libéré");
    }
}
