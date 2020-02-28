package Queue;

class MyCircularQueue {
    private int start;
    private int tail;
    private int size;
    private int capacity;
    private int[] storage;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.storage = new int[k];
        this.start = 0;
        this.tail = 0;
        this.size = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        
        if(tail == capacity - 1)
        {
            tail = 0;
            storage[tail] = value;
        }
        else{
            storage[tail ++] = value;
        }
        size ++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty())
        {
            start = 0;
            tail = 0;
            return false;
        }
        
        if(start == capacity - 1)
        {
            start = 0;
        }
        else
        {
            start ++;
        }
        size--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return storage[start];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return storage[tail];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == capacity;
    }
    
    
    public static void main()
    {
    	MyCircularQueue queue = new MyCircularQueue(3);
    	System.out.println(queue.enQueue(1));
    	System.out.println(queue.enQueue(2));
    	System.out.println(queue.enQueue(3));
    	System.out.println(queue.enQueue(4));
    	System.out.println(queue.Rear());
    	System.out.println(queue.isFull());
    	System.out.println(queue.deQueue());
    	System.out.println(queue.enQueue(4));
    	System.out.println(queue.Rear());
    }
}
