
package Queue;

public class mainQueue {
    public static void main(String[] args) {
        queue newQueue = new queue(10);
        newQueue.enqueue(98);
        newQueue.show();
        newQueue.enqueue(60);
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        System.out.println("Nama Saya Adalah(Muhammad Rizky Ikhval)");
        newQueue.enqueue(70);
        newQueue.show();
        System.out.println("data yang diambil = "+newQueue.dequeue());
        newQueue.show();
        System.out.println("data paling depan = "+newQueue.peek());
        }
}
