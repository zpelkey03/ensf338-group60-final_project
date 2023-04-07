package mylib.datastructures.linear;

import mylib.datastructures.nodes.DNode;
public class QueueLL extends SLL {

    public QueueLL(){
        super();
    }

    public QueueLL(DNode head){
        super(head);
    }

    @Override
    public void InsertHead(DNode node){
    }

    @Override
    public void Insert(DNode node, int position){
    }

    @Override
    public void DeleteTail(){
    }

    @Override
    public void Delete(DNode node){
    }

    @Override
    public void SortedInsert(DNode node){
    }

    @Override
    public void Sort(){
    }

    public void enqueue(DNode node){
        super.InsertTail(node);
    }

    public DNode dequeue(){
        DNode node = super.getHead();
        super.DeleteHead();
        return node;
    }

    public DNode peek(){
        return super.getHead();
    }

    public int search(DNode node) {
        DNode current = super.getHead();
        int position = 0;
        while (current != null) {
            position++;
            if (current.getData() == node.getData()) {
                return position;
            }
            current = current.getNext();
        }
        return -1;
    }




}
