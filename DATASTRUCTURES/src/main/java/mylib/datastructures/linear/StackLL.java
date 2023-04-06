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

    public void Push(DNode node){
        super.InsertHead(node);
    }

    public DNode Pop(){
        DNode node = super.getHead();
        super.DeleteHead();
        return node;
    }


}
