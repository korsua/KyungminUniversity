package org.example.Thread;

public class TestThread implements Runnable {

    int testNum = 0;
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("첫 번째 쓰레드")){
                System.out.println("=========================================");
                testNum++;
            }
            System.out.println("쓰레드 이름" + Thread.currentThread() + "testNum" + testNum);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }



    }

}
