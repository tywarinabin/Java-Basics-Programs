import java.security.InvalidAlgorithmParameterException;

class MyThread  extends Thread {
    public void run(){
        for(int i = 1;i<5;i++){
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
                System.out.println("Invalid value of i"+ x);
            }
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            // System.out.println("Thread 2 is running.");
            // System.out.println("Thread 2 is Happy ");
            System.out.println();
            System.out.println(Thread.currentThread().getName() + "   is Running .");
            try {
                Thread.sleep(1000);
                throw new InvalidAlgorithmParameterException("This is Exception");
            } catch (Exception x) {

            }
        }
    }
}
public class ExtendThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t1.setName("Thread  1. ");
        t2.setName("Thread  2.");
        t2.start();
    }
}
