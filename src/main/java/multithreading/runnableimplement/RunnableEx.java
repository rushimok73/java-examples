package multithreading.runnableimplement;

class Worker implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class RunnableEx {

    public static void main(String[] args) {
        Runnable w = new Worker();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }

}
