
class MyRunnable implements Runnable {
    
    @Override
    public void run() {
        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();


        Thread thread = new Thread(myRunnable);

        thread.start();
    }
}
