public class ExerciseB {
    // update the number of interactions
    public static final int NUM_ITER = 5;

    static class MyThread extends Thread {
        private String name;

        // update the constructor to use a counter
        MyThread (String name) {
            this.name = name;
        }

        void writeHello() {
            System.out.println("Hello " + name);
        }

        public void run () {
            // update the loop
            for (int i = 0; i < NUM_ITER; i++) {
                writeHello();
            }
        }
    }

    public static void main (String[] args) throws Exception {
        // initialize a counter
        // fix the calls to the updated constructor
        Thread a = new MyThread("A");
        Thread b = new MyThread("B");

        a.start();
        b.start();

        a.join();
        b.join();
        // output the final counter value
    }
}
