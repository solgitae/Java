public class Ex01 {

    public static void main(String[] args) {

        Thread_01 t1 = new Thread_01();
        Runnable r = new Thread_02();
        Thread t2 = new Thread(r);


        t1.start();
        t2.start();

    }
}



class Thread_01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");

        }
    }
}

class Thread_02 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("+");
            System.out.println(Thread.currentThread().getName());
        }
    }
}