import java.lang.management.ManagementFactory;

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount = 1;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        @Override
        public String toString() {
            int a = 1;
            while (a < count) {
                new GenerateThread().run();
                System.out.println(Thread.currentThread().getName() + " created");
            }
            return Thread.currentThread().getName() + " created";

        }


        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if (createdThreadCount < count) {
                System.out.println(new GenerateThread());
            }
        }
    }
}
