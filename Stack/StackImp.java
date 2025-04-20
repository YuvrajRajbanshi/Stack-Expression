package Stack;

public class StackImp {
    int top;
    int size;
    int[] arr;

    StackImp(int top, int size, int arr[]) {
        this.top = top;
        this.size = size;
        this.arr = new int[size];
    }

    public void push(int val) {
        if (top == size - 1) {
            return;
        }
        arr[++top] = val;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        return arr[top--];
    }

    public int peek() {

        if (top == -1)
            return -1;
        return arr[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int top = -1;
        int size = 4;
        int arr[] = new int[size];
        StackImp stack = new StackImp(top, size, arr);

        // stack.push(1);
        // stack.push(23);
        // stack.push(3);
        // stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        // System.out.println(stack);
    }
}
