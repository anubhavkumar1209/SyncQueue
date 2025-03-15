public class Main {
    public static void main(String[] args) {
        Company com = new Company();
        Producer p = new Producer(com);
        Consumer c = new Consumer(com);

        // Set thread names (useful for debugging)
        p.setName("Producer-Thread");
        c.setName("Consumer-Thread");

        p.start();
        c.start();
    }
}
