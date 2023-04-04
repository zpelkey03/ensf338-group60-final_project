package mylib;

import mylib.datastructures.linear.*;
import mylib.datastructures.nodes.*;
public class main {
    public static void main(String[] args) {

        DNode[] head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        SLL list = new SLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list.InsertHead(head[i]);
        }
        list.Print();
    }
}

