package srccc.basics.multithreading;

cclass MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();  
        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}