package Day11;

import Day1.Demo;

public class MultiThread implements Runnable{
    static Thread t,t1;
    /**
     * user
     * system
     *
     * Thread
     * Runnable
     * lifecycle:
     * ->new
     * ->ready
     * ->running
     * ->waiting or sleep
     * ->end/ terminated
     * */
    public static void main(String[] args) {

        demo demo = new demo();
        demo.start();
//       t = new Thread(this,"aditya");
//       t1 = new Thread(this,"Java");
//       t.setPriority(1);
//       t.start();
//       t1.start();

    }

    @Override
    public void run() {
        System.out.println("Thread is running");
        System.out.println(Thread.currentThread().getName());
        System.out.println(t.getPriority());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class demo implements Runnable{
    Thread t,t1;

    void start(){
        t = new Thread(this,"aditya");
        t1 = new Thread(this,"Java");
        t.setPriority(1);
        t.start();
        t1.start();
    }

    @Override
    public void run() {
//        System.out.println("my thread is running");
        for (int i=0 ;i<3;i++){
//            System.out.println(Thread.currentThread().getName());
            try {
                System.out.println(Thread.currentThread().getName()+" is going to sleep");
                Thread.sleep(100,1000);

                System.out.println(Thread.currentThread().getName()+" woke up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class demo1 extends Thread{
    public void run(){

    }
    public void start(){

    }
}