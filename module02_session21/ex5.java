package module02_session21;

public class ex5 {

}

class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 =  new OddThread();
        Thread t2 =  new EvenThread();
          t1.start();
          t1.join();
          t2.start();
    }
}

class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}



class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}