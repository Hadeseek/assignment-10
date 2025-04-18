public class Task1 implements Runnable {

    @Override
    public void run() {
        try {
            // Simulating some task
            System.out.println("Task 1 is running.");
            Thread.sleep(1000);  // Simulating task delay
            System.out.println("Task 1 is finished.");
        } catch (InterruptedException e) {
            System.out.println("Task 1 interrupted.");
        }
    }
}
