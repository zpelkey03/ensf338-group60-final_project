
import mylib.datastructures.linear.*;
import mylib.datastructures.nodes.*;
import mylib.datastructures.trees.AVL;
import mylib.datastructures.trees.BST;
public class Main {
    public static void main(String[] args) {
        //Test Nodes
        DNode test = new DNode(5);
        DNode test2 = new DNode(10);
        DNode test3 = new DNode(-1);
        //SLL
        System.out.println("SLL tests:");
        DNode[] head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        SLL list1 = new SLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list1.InsertHead(head[i]);
        }

        list1.InsertTail(test);
        list1.InsertHead(test);
        list1.Insert(test2, 5);
        list1.SortedInsert(test3);
        list1.Print();
        System.out.println(list1.Search(test).getData()+ "\n");

        System.out.println("Head and Tail Deletions");
        list1.DeleteHead();
        list1.DeleteTail();
        list1.Print();

        //DLL Tests
        System.out.println("DLL tests:");
        head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        DLL list2 = new DLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list2.InsertHead(head[i]);
        }

        list2.InsertTail(test);
        list2.InsertHead(test);
        list2.Insert(test2, 5);
        list2.SortedInsert(test3);

        list2.Print();
        System.out.println(list2.Search(test).getData()+ "\n");

        System.out.println("Head and Tail Deletions");
        list2.DeleteHead();
        list2.DeleteTail();
        list2.Print();

        //CSLL Tests
        System.out.println("CSLL tests:");
        head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        CSLL list3 = new CSLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list3.InsertHead(head[i]);
        }

        list3.InsertTail(test);
        list3.InsertHead(test);
        list3.Insert(test2, 5);
        list3.SortedInsert(test3);

        list3.Print();
        System.out.println(list3.Search(test).getData()+ "\n");

        System.out.println("Head and Tail Deletions");
        list3.DeleteHead();
        list3.DeleteTail();
        list3.Print();

        //CDLL Tests
        System.out.println("CDLL tests:");
        head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        CDLL list4 = new CDLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list4.InsertHead(head[i]);
        }
        list4.InsertTail(test);
        list4.InsertHead(test);
        list4.Insert(test2, 5);
        list4.SortedInsert(test3);

        list4.Print();
        System.out.println(list4.Search(test).getData()+ "\n");

        System.out.println("Head and Tail Deletions");
        list4.DeleteHead();
        list4.DeleteTail();
        list4.Print();

        //Queue tests
        System.out.println("Queue tests:");
        head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        QueueLL list5 = new QueueLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list5.InsertHead(head[i]);
        }
        list5.InsertTail(test);
        list5.InsertHead(test);

        list5.Print();

        System.out.println("Dequeue & enqueue");
        list5.dequeue();
        list5.enqueue(test2);
        list5.Print();
        System.out.println("Peek and Search");
        System.out.println(list5.peek().getData());
        System.out.println(list5.search(test));


        //Stack tests
        System.out.println("Stack tests:");
        head = new DNode[10];
        for (int i = 9; i >= 0; i--) {
            head[i] = new DNode(i);
        }
        StackLL list = new StackLL(head[0]);
        for (int i = 1; i < 10; i++) {
            list.InsertHead(head[i]);
        }
        list.InsertTail(test);
        list.InsertHead(test);

        list.Print();

        System.out.println("Pop & Push");
        list.push(test2);
        DNode popped = list.pop();
        System.out.println(popped.getData());
        list.Print();

        System.out.println("Peek and Search");
        System.out.println(list.peek().getData());
        System.out.println(list.search(test));


        // Create a new BST
        BST bst = new BST();

        TNode node1 = new TNode();
        node1.setData(5);
        TNode node2 = new TNode();
        node2.setData(3);
        TNode node3 = new TNode();
        node3.setData(7);
        TNode node4 = new TNode();
        node4.setData(2);
        TNode node5 = new TNode();
        node5.setData(4);
        TNode node6 = new TNode();
        node6.setData(6);
        TNode node7 = new TNode();
        node7.setData(8);
        TNode node8 = new TNode();
        node8.setData(1);
        TNode node9 = new TNode();
        node9.setData(9);
        // Insert values into the BST
        bst.insert(node1);
        bst.insert(node2);
        bst.insert(node3);
        bst.insert(node4);
        bst.insert(5);
        bst.insert(6);
        bst.insert(8);

        // Print the BST in-order
        System.out.print("In-order traversal: ");
        bst.printInOrder();
        System.out.println();

        // Print the BST using breadth-first traversal
        System.out.println("Breadth-first traversal:");
        bst.printBF();

        // Search for a value in the BST
        int searchVal = 6;
        TNode searchResult = bst.search(searchVal);
        if (searchResult != null) {
            System.out.printf("Found value %d in the BST.\n", searchVal);
        } else {
            System.out.printf("Could not find value %d in the BST.\n", searchVal);
        }

        // Delete a value from the BST
        int deleteVal = 4;
        bst.delete(deleteVal);

        // Print the BST using breadth-first traversal after deletion
        System.out.println("Breadth-first traversal after deletion:");
        bst.printBF();


        //Avl tree tests
        AVL tree = new AVL();

        tree.insert(node1);
        tree.insert(node2);
        tree.insert(node3);
        tree.insert(node4);
        tree.insert(node5);
        tree.insert(node6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);

        System.out.println("AVL tree tests:\n");
        System.out.println("In-order traversal:");
        tree.printInOrder();

        System.out.println("\nBreadth-first traversal:");
        tree.printBF();

        System.out.println("\nDelete node with value 5:");
        tree.delete(5);

        System.out.println("\nIn-order traversal after delete:");
        tree.printInOrder();

        System.out.println("\nBreadth-first traversal after delete:");
        tree.printBF();
    }
}