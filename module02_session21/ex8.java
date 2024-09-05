package module02_session21;

public class ex8 {
    private int sharedValue = 0;

    public synchronized void increment() {
        sharedValue++;
        System.out.println("Incremented value: " + sharedValue);
    }

    public synchronized void decrement() {
        sharedValue--;
        System.out.println("Decremented value: " + sharedValue);
    }

    public static void main(String[] args) {
        ex8 demo = new ex8();

        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                demo.increment();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                demo.decrement();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        incrementThread.start();
        decrementThread.start();
    }


}



