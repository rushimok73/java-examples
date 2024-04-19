package multithreading.threadextend;

class Worker extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Worker w3 = new Worker();
        w1.start();
        w2.start();
        w3.start();
    }
}
