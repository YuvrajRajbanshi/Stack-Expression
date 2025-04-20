package Queue;

public class Implement {

    static class ImpQueue {

        int arr[];
        int size;
        int rear;

        public ImpQueue(int size) {
            this.arr = new int[size];
            this.size = size;
            this.rear = -1;
        }

        public void add(int val) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = val;
        }

        public int dequeue() {
            if (rear == -1) {
                System.out.println("The Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public int peek() {
            if (rear == -1) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {

        ImpQueue q = new ImpQueue(4);

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Peek: " + q.peek()); // 10
        System.out.println("Dequeue: " + q.dequeue()); // 10
        System.out.println("Peek after dequeue: " + q.peek()); // 20
    }
}
