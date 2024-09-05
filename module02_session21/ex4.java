package module02_session21;

public class ex4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberGenerator() {});
        Thread t2 = new Thread(new NumberGenerator() {});

        t1.start();
        t2.start();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
    }
}

class NumberGenerator implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread:" + Thread.currentThread().getName() +
                    "Number :" + i +
                    "HashCode" + this.hashCode());
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
