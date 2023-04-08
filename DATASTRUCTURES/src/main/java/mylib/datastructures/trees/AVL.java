package mylib.datastructures.trees;

import mylib.datastructures.nodes.TNode;

public class AVL extends BST{

    private TNode root;

    public AVL() {
        super();
    }

    public AVL(int val) {
        super(val);
    }

    public AVL(TNode obj) {
        super(obj);
        // If the TNode obj has children, the constructor needs to create a balanced tree from passed tree by one 
        // of the two following options: iteratively inserting nodes from the original tree and balancing the 
        // new created AVL tree or implementing a full tree balancing algorithm (Bonus)
    }

    public TNode getRoot() {
        return root;
    }

    public void setRoot(TNode root) {
        this.root = root;
        // the setter function must check if the node has children. If children are found it must do the same
        // as the overload constructor.
    }


    public void insert(TNode node){
        // inserts the node passed as argument into the tree
        // Must maintain the tree balance. It can call the super.insert (insert function from BST), but will need to also balance the tree after
    }

    public void insert(int val) {
        // creates a new node with data val to be inserted into the tree
        // Must maintain the tree balance. It can call the super.insert (insert function from BST), but will need to also balance the tree after
    }

    public void delete(int val) {
        TNode search = search(val);
        if (search != null) {
            // delete the node
            // balance the tree
        } else {
            System.out.println("Value not found in tree");
        }
        // finds the node with val as data and deletes it, if not found prints a statement that the value is not in the tree
    }

    public TNode search(int val) {
        return super.search(val);
    }

    public void printInOrder() {
        super.printInOrder();
    }

    public void printBF() {
        super.printBF();
    }

    private void balance() {

    }

    // Hint: implement the balance function as a helper function (private function) and call it in the insert (and Delete if you attempt the bonus)
}
