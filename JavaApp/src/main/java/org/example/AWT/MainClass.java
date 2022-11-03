package org.example.AWT;

public class MainClass {
    public static void main(String[] args) {
//        MakeButton btn = new MakeButton();
//
//        btn.pack();
////        btn.setSize(200,200);
//        btn.setVisible(true);
//        doSleep(5000);  // Thread.Sleep()
//
//        btn.setVisible(false);
//        btn.dispose();
//
//        doSleep(5000);  // Thread.Sleep()
//        System.exit(0);

        MakeFrame frame = new MakeFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    private static void doSleep(int millis) {
        try{
            Thread.sleep(millis);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}



