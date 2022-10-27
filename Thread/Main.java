package Thread;

/**
 *
 * # Thread
 * 1. 객체 하나가 여러개의 쓰레드를 사용하는 방법
 * 2. 객체 여러개가 각자 한개씩 쓰레드를 가지는 방법
 *
 *
 * ## Thread 의 생성방법
 * 클래스와 인터페이스가 있다.
 * 인터페이스는 다중상속을 지원하기 때문에 인터페이스 쓰레드도 있다 .
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadClassExtends thCE = new ThreadClassExtends();
        thCE.setName("쓰레드생성");
        thCE.start();


        Runnable runnable = new RunnableImplement();
        Thread thread = new Thread(runnable);
        thread.setName("Implement Runnable");
        thread.start();

        for(int i = 0 ; i < 1000;i++){
            Thread.sleep(500);
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Thread.currentThread().getName());
        System.out.println("메인 클래스");
    }
    /*
    main
    메인클래스
    쓰레드새엇ㅇ
    쓰레드 상속클래스
    */
}

