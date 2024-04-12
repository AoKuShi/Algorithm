package queue;

public class IntQueue {
  private int[] queue;
  private int front;
  private int rear;
  private int size;
  private int capacity;

  public IntQueue(int capacity) {
    this.queue = new int[capacity];
    this.front = this.rear = this.size = 0;
    this.capacity = capacity; 
  }

  public int getCapacity() {
    return capacity;
  }

  public int getSize(){
    return size;
  }

  public void enqueue(int data) {
    queue[rear++] = data;
    if (rear == capacity) {
      rear = 0;
    }
    size++;
  }

  public int dequeue() {
    int result = queue[front++];
    if (front == capacity) {
      front = 0;
    }
    size--;
    return result;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == capacity;
  }

  public int getFront() {
    return queue[front];
  }

  public void clear() {
    size = front = rear = 0;
  }

  public void dump() {
    if (isEmpty()) {
      System.out.println("큐가 비어 있습니다.");
    } else if (front < rear) {
      for (int i = front; i < rear; i++) {
        System.out.print(queue[i] + " ");
      }
      System.out.println();
    } else {
      for (int i = front; i < capacity; i++) {
        System.out.print(queue[i] + " ");
      }
      for (int i = 0; i < rear; i++) {
        System.out.print(queue[i] + " ");
      }
      System.out.println();
    }
  }


}
