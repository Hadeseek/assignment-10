public class Task2 implements Runnable {

    @Override
    public void run() {
        try {
            // Simulating some task
            System.out.println("Task 2 is running.");
            Thread.sleep(2000);  // Simulating task delay
            System.out.println("Task 2 is finished.");
        } catch (InterruptedException e) {
            System.out.println("Task 2 interrupted.");
        }
    }
}
