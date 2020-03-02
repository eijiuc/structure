package com.cuijie.practice.data.structure.linked;

public class Linked<T> {

    private int count;
    private Node head;
    private Node tail;

    public Linked() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    private class Node<T>{
        private T value;
        private Node next;

        public Node() {
        }

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public void inversion(){
        Node node = this.head;
        if(node == null || node.next == null){
            return;
        }
        Node next = this.tail;
        this.tail = this.head;
        this.head = next;
        Node pre = null;

        while(node != null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
    }
    public void insert(T t){
        Node<T> insertedNode = new Node(t, null);
        if(count == 0 ){
            head = insertedNode;
            tail = insertedNode;
        }else {
            tail.next = insertedNode;
            tail = insertedNode;
        }
        this.count++;
    }

    public void print(){
        print(this.head);
    }

    public void print(Node<T> node){
        if(node == null){
            System.out.println("当前链表为空！");
        }

        while (node != null){
            System.out.println("current node : " + node.value +"; linked size is " + count);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Linked<Integer> linked = new Linked();
        linked.insert(1);
        linked.insert(2);
        linked.insert(3);
        linked.insert(4);
        linked.insert(5);
        linked.print();
        linked.inversion();
        linked.print();
    }


}
