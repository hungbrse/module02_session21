package module02_session21;

public class ex3 {
    public static void main(String[] args) {
        Thread t1= new Thread(new EvenNumber());
        Thread t2 = new Thread(new OddNumber());

        t1.start();
        t2.start();

    }
}

class EvenNumber implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



class OddNumber implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
