package Thread;

public class ThreadClassExtends extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("쓰레드 클래스 상속 쓰레드 ");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
//                throw new RuntimeException(e);
            }
        }
    }
}
