//THIS PROGRAM PREPARED BY PRINCE UPADHYAY 21CE148
// 4) Create a class named Stack. Design a class named Queue for storing integers. Like a
// stack, a queue holds elements. In a stack, the elements are retrieved in a last-in first-
// out fashion. In a queue, the elements are retrieved in a first-in first-out fashion. The
// class contains:
//  An int[] data field named elements that stores the int values in the queue.
//  A data field named size that stores the number of elements in the queue.
//  A constructor that creates a Queue object with default capacity 8.
//  The method enqueue(int v) that adds v into the queue.
//  The method dequeue() that removes and returns the element from the queue.
//  The method empty() that returns true if the queue is empty.
//  The method getSize() that returns the size of the queue.

import java.util.*;

class QueueExapmle {
    private ArrayList<Integer> arr;
    private int size;

    Scanner sc = new Scanner(System.in);

    QueueExapmle(){
        System.out.println("Enter elements for Queue: ");
        size = 8;
        arr = new ArrayList<Integer>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    QueueExapmle(int size){
        System.out.println("Enter elements for Queue: ");
        this.size = size;
        arr = new ArrayList<Integer>(size);
        for (int i=0;i<size;i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    public void enqueue(int v){
        arr.add(v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println(arr);
    }
}

class StackExample {
    private ArrayList<Integer> arr;
    private int size;

    Scanner sc = new Scanner(System.in);

    StackExample(){
        System.out.println("Enter the elements for Stack: ");
        size = 8;
        arr = new ArrayList<Integer>(size);
        int a[] = new int[size];
        for (int i=size-1;i>=0;i--) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            arr.add(i);
        }
    }

    StackExample(int size){
        System.out.println("Enter elements for Stack: ");
        this.size = size;
        arr = new ArrayList<Integer>(size);
        int a[] = new int[size];
        for (int i=size-1;i>=0;i--) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            arr.add(i);
        }
    }

    public void enqueue(int v){
        arr.add(0, v);
    }

    public int dequeue(){
        arr.remove(3);
        return arr.get(3);
    }

    public boolean empty(){
        return arr.isEmpty();
    }

    public int getSize() {
        return size;
    }

    public void display(){
        System.out.println(arr);
    }
}

public class Practical_4 {
    public static void main(String[] args) {
        StackExample s = new StackExample();
        QueueExapmle q = new QueueExapmle();

        s.display();
        q.display();

        s.enqueue(20);
        q.enqueue(20);

        s.display();
        q.display();

        System.out.println(s.dequeue());
        System.out.println(q.dequeue());

        s.display();
        q.display();

        s.getSize();
        q.getSize();
    }
}