package mylib.datastructures.linear;

import mylib.datastructures.nodes.DNode;

public class StackLL extends SLL{

    public StackLL(){
        super();
    }

    public StackLL(DNode head){
        super(head);
    }

    @Override
    public void InsertTail(DNode node){
    }

    @Override
    public void Insert(DNode node, int position){
    }

    @Override
    public void SortedInsert(DNode node){
    }

    @Override
    public void DeleteTail(){
    }

    @Override
    public void Delete(DNode node){
    }

    @Override
    public void Sort(){
    }

    public void push(DNode node){
        super.InsertHead(node);
    }

    public DNode pop(){
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
