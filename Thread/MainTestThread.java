package Thread;

public class MainTestThread {
    public static void main(String[] args) {

        /**
         * 객체 하나를 n개의 스레드가 공유하는 방법
         *
         */
        TestThread testThread = new TestThread();
        // TestThread testThread1 = new TestThread();
        Thread th0 = new Thread(testThread, "첫 번째 쓰레드");
        Thread th1 = new Thread(testThread, "두 번째 쓰레드");
        th0.start();
        th1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("메인클래스");
    }
}
