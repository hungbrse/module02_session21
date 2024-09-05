package module02_session21;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            Scanner sc = new Scanner(System.in);
                System.out.println("nhập militimes sleep");
            int sleepTime = Integer.parseInt(sc.nextLine());

                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello World");
            }

        });

        t1.start();
    }
}
