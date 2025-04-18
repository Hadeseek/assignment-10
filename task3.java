public class Task3 implements Runnable {

    @Override
    public void run() {
        try {
            // Simulating some task
            System.out.println("Task 3 is running.");
            Thread.sleep(1500);  // Simulating task delay
            System.out.println("Task 3 is finished.");
        } catch (InterruptedException e) {
            System.out.println("Task 3 interrupted.");
        }
    }
}
