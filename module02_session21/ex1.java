package module02_session21;

public class ex1  extends  Thread{
    @Override
    public void run() {
        int count = 10;

        for (int i = 1; i <= count; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        Thread t1 = new ex1();

        t1.start();



    }
}
