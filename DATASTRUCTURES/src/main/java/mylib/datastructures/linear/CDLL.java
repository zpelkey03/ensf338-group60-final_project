package mylib.datastructures.linear;

import mylib.datastructures.nodes.DNode;

public class CDLL extends DLL{
    private DNode head;
    private DNode tail;
    private int size;

    public CDLL(){
        head = null;
        tail = null;
        size = 0;
    }

    public CDLL(DNode head){
        this.head = head;
        tail = null;
        size = 1;
        DNode current = head;
        if(current.getNext() != null) {
            while (current.getNext().getData() != head.getData()) {
                current = current.getNext();
                size++;
            }
        }
        current.setNext(this.head);
        tail = current;
    }

    @Override
    public void InsertHead(DNode node){
        if(head == null){
            head = node;
            tail = node;
            head.setNext(head);
            head.setPrev(head);
        }else{
            node.setNext(head);
            tail.setNext(node);
            node.setPrev(tail);
            head = node;
        }
        size++;
    }

    @Override
    public void InsertTail(DNode node){
        if(head == null){
            head = node;
            tail = node;
            head.setNext(head);
        }else{
            tail.setNext(node);
            node.setNext(head);
            head.setPrev(node);
            tail = node;
        }
        size++;
    }

    @Override
    public void Insert(DNode node, int position) {
        if (position < 1 || position > size + 1) {
            throw new IndexOutOfBoundsException();
        }
        if (position == 1) {
            InsertHead(node);
        } else if (position == size + 1) {
            InsertTail(node);
        } else {
            DNode current = head;
            for (int i = 1; i < position - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.getNext().setPrev(node);
            node.setPrev(current);
            current.setNext(node);
            size++;
        }
    }

        @Override
        public void SortedInsert(DNode node){
            if(head == null){
                head = node;
                tail = node;
                head.setNext(head);
            }else{
                if(!isSorted()){
                    Sort();
                }
                DNode current = head;
                while(current.getNext() != head && current.getNext().getData() < node.getData()){
                    current = current.getNext();
                }
                node.setNext(current.getNext());
                node.setPrev(current);
                current.getNext().setPrev(node);
                current.setNext(node);
                if(current == tail){
                    tail = node;
                }
            }
            size++;
        }

    @Override
    public DNode Search(DNode node){
        if(head == null){
            return null;
        }else{
            DNode current = head;
            while(current.getNext() != head && current.getData() != node.getData()){
                current = current.getNext();
            }
            if(current.getData() == node.getData()){
                return current;
            }else{
                return null;
            }
        }
    }

    @Override
    public void DeleteHead(){
        if(head == null){
            return;
        }else{
            head.getNext().setPrev(tail);
            head = head.getNext();
            tail.setNext(head);
            size--;
        }
    }

    @Override
    public void DeleteTail(){
        if(head == null){
            return;
        }else{
            DNode current = head;
            while(current.getNext() != tail){
                current = current.getNext();
            }
            current.setNext(head);
            tail = current;
            head.setPrev(tail);
            size--;
        }
    }

    @Override
    public void Delete(DNode node){
        if(head == null){
            return;
        }else{
            DNode current = head;
            while(current.getNext() != head && current.getNext().getData() != node.getData()){
                current = current.getNext();
            }
            if(current.getNext().getData() == node.getData()){
                current.setNext(current.getNext().getNext());
                current.getNext().setPrev(current);
                size--;
            }
        }
    }

    @Override
    public boolean isSorted(){
        if(head == null){
            return true;
        }else{
            DNode current = head;
            while(current.getNext() != head && current.getData() <= current.getNext().getData()){
                current = current.getNext();
            }
            if(current.getNext() == head){
                return true;
            }else{
                return false;
            }
        }
    }

    @Override
    public void Sort(){
        if(head == null){
            return;
        }else{
            DNode current = head;
            DNode next = null;
            int temp;
            while(current.getNext() != head){
                next = current.getNext();
                while(next != head){
                    if(current.getData() > next.getData()){
                        temp = current.getData();
                        current.setData(next.getData());
                        next.setData(temp);
                    }
                    next = next.getNext();
                }
                current = current.getNext();
            }
        }
    }

    @Override
    public void Print() {
        System.out.println("List length: " + size);

        if (isSorted()) {
            System.out.println("Sorted: Yes");
        } else {
            System.out.println("Sorted: No");
        }

        System.out.print("List content: ");

        if (head == null) {
            System.out.println("empty");
        } else {
            DNode current = head;
            System.out.print(current.getData());
            current = current.getNext();
            while (current.getData() != head.getData()) {
                System.out.print(" -> " + current.getData());
                current = current.getNext();
            }
            System.out.println();
        }
    }

    @Override
    public void Clear(){
        head = null;
        tail = null;
        size = 0;
    }
}



