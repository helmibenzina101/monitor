package monitor;

public class ClientR extends Thread{
    private X x;
    ;
    public ClientR(X x) {
        this.x = x;}
    public  void run() {


    x.reserver();
    System.out.println("Client R a réservé");
}
}
