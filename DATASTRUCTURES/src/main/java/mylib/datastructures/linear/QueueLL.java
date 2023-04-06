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

    public void Enqueue(DNode node){
        super.InsertTail(node);
    }

    public DNode Dequeue(){
        DNode node = super.getHead();
        super.DeleteHead();
        return node;
    }

}
