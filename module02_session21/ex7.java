package module02_session21;

import java.util.Random;

public class ex7 extends Thread {
    @Override
    public void run() {
        Random rand = new Random();
        int radom = rand.nextInt(10) + 100;

        System.out.println(radom);
    }

    public static void main(String[] args) {
        Thread t1 = new ex7();
        t1.start();
    }
}
