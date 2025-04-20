package Queue;

public class CircularQueue {

    static class circularQueue {

        int arr[];
        int front;
        int rear;
        int n;

        public circularQueue(int n) {
            this.arr = new int[n];
            this.front = -1;
            this.rear = -1;
            this.n = n;
        }

        public boolean isEmtpy() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % n == front;
        }

        public void enque(int val) {
            if (isFull()) {
                System.out.println("Sorry we are unable to process ur request");
                return;
            }

            if (front == -1)
                front = 0;
            rear = (rear + 1) % n;
            arr[rear] = val;
        }

        public int deque() {
            if (isEmtpy()) {
                System.out.println("Sorry we are unable to process ur request sir");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % n;
            }
            return result;
        }

        public int peek() {
            if (isEmtpy()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        circularQueue q = new circularQueue(5); // Capacity 5

        q.enque(10);
        q.enque(20);
        q.enque(30);
        q.enque(40);
        q.enque(50); // Will be full here

        System.out.println("Peek: " + q.peek()); // 10

        q.deque(); // removes 10
        q.deque(); // removes 20

        q.enque(60); // reused space
        q.enque(70); // reused space

        while (!q.isEmtpy()) {
            System.out.println("Removed: " + q.deque());
        }
    }

}
