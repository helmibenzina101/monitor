package monitor;

import  java.util.concurrent.locks.*;
public class X {
    private int nbrplace = 0;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition c1 = lock.newCondition();
    public void reserver(){
        lock.lock();
       try {
           while (nbrplace ==0) {
               try {
                   System.out.println("Client R en attente");
                   c1.await();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
             nbrplace--;
       }
       catch (Exception e) {
           throw new RuntimeException(e);}
         finally {
        lock.unlock();}
    }
    public void liberer(){
        lock.lock();
        try {
            nbrplace++;
            c1.signal();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
        lock.unlock();
    }
}}

