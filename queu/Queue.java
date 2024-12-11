package queu;

public class Queue {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data)
    {
        if(!isFull())
        {
        queue[rear] = data;
        rear = (rear+1)%5; //inserting rear++,front same,,,,%5 circular
        size = size+1;
        }
        else
        {
        System.out.println("Queue is Full");
        }
    }

    public int deQueue()
    {
        int data = queue[front];
        if(!isEmpty())
        {
        front = (front+1)%5;// %size-circular queue
        size = size-1;
        }
        else
        System.out.println("Queue is Empty");
        return data;

    }

    public void show()
    {
        System.out.print("Elements : ");
        for(int i=0; i<size; i++)
        {
            //System.out.print(queue[i] + " ");
            System.out.print(queue[(front+i)%5] + " ");
        }
        System.out.println();

        for(int n : queue)
        {
            System.out.print(n + " ");
        }
    }
    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return getSize()==0;
    }

    public boolean isFull()
    {
        return getSize()==5;
    }

}
