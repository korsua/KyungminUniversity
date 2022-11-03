package org.example.Thread;

import java.util.Random;

/**
 * 투표 개푱
 */
public class VoteThread implements Runnable{
    int target = 100;
    int sum = 0;
    Random rd = new Random();

    @Override
    public synchronized void run() {
        StringBuffer sb = new StringBuffer();

        wh:
        while (true) {
            sum = sum + rd.nextInt(10);
            sb.delete(0, sb.toString().length());

            if (sum >= target) {
                sum = 100;
                for (int i = 0; i < sum; i ++){
                    sb.append("*");
                }
                System.out.println(Thread.currentThread().getName()+ " 개표율 " + sum + "%\t" + sb + "\t1위 박남일");
                break wh;
            }else{
                for (int i = 0; i < sum-1; i++) {
                    sb.append('*');
                }
                System.out.println(Thread.currentThread().getName()+ " 개표율 " + sum + "%\t" + sb);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("선거 개표 진행");

        VoteThread v1 = new VoteThread();
        VoteThread v2 = new VoteThread();
        VoteThread v3 = new VoteThread();
        
        Thread th1 = new Thread(v1,"제 1선거구");
        Thread th2 = new Thread(v2,"제 2선거구");
        Thread th3 = new Thread(v3,"제 3선거구");

        th1.start();
        th2.start();
        th3.start();

    }
}
