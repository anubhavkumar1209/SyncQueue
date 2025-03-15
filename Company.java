public class Company {
    int n;
    boolean f = false; 
    // f = false → Producer's turn, f = true → Consumer's turn

    synchronized public void produce_item(int n) throws Exception {
        while (f) {
            wait();
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        while (!f) {
            wait();
        }
        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
