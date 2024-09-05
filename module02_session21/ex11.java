package module02_session21;

import java.util.ArrayList;

public class ex11 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ArrayList<Integer> list = new ArrayList<>();

                for (int i = 2; i < 10000; i++) {
                        if (isPrime(i)) {
                            list.add(i);
                        }
                }

                for (Integer i : list) {
                    System.out.println(i);
                }
            }

            public boolean isPrime(int n) {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }

        });

        t1.start();
    }
}
