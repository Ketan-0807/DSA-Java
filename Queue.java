class Queue {
    private int[] queuearr;
    private int MaxSize;
    private int rear = -1;
    private int front = 0;

    public Queue(int size) {
        this.front = 0;
        this.rear = -1;
        this.MaxSize = size;
        this.queuearr = new int[MaxSize];
    }

    public boolean isFull() {
        return ((rear + 1 ) % MaxSize == front);
    }

    public boolean isEmpty() {
        return (front > rear);
        
    }

    void enqueue(int ele) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1) % MaxSize;
            queuearr[rear] = ele;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        } else {
            int ele = queuearr[front];
            front++;
            if (front > rear) {
                front = 0;
                rear = -1;
            }
            return ele;
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Items -> ");
            for (int i = front; i <= rear; i++){
                System.out.println((i+1)%MaxSize);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(3);
        q.enqueue(7);
        q.dequeue();
        
        q.display();
        System.out.println(q.dequeue() + " removed from the queue");
        q.display();
        System.out.println(q.dequeue() + " removed from the queue");
        q.display();
    }
}
