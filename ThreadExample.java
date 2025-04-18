

public class ThreadExample {

    public static void main(String[] args) {
        // Creating thread objects
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        Thread thread3 = new Thread(new Task3());

        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    // Each thread's task is separated into different classes implementing Runnable.
}
