class Thread1 implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            // System.out.println("Thread 1 is running.");
            // System.out.println("Thread 1 is Happy ");
            System.out.println();
            System.out.println(Thread.currentThread().getName() + "is Running .");
            try {
                if (i == 3) {
                    throw new InterruptedException("Invaid Syntax");
                }
                Thread.sleep(500);
            } catch (Exception x) {
                System.out.println("Invalid value of i" + x);
                

            }
        }
    }
}

public class RunnableThread {

    public static void main(String[] args) {
        Thread1 t = new Thread1();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
