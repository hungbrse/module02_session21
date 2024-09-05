package module02_session21;

public class ex2 extends Thread{
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        ex2 ex = new ex2();
        ex.start();
    }
}
