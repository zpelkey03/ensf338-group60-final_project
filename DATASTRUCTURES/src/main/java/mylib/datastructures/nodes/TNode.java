package mylib.datastructures.nodes;

public class TNode {
    private int data;
    private TNode left;
    private TNode right;
    private TNode parent;
    private int balance;

    public TNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
        this.parent = null;
        this.balance = 0;
    }

    public TNode(int data, int balance, TNode P, TNode L, TNode R) {
        this.data = data;
        this.balance = balance;
        this.parent = P;
        this.left = L;
        this.right = R;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TNode getLeft() {
        return left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }

    public TNode getParent() {
        return parent;
    }

    public void setParent(TNode parent) {
        this.parent = parent;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Parent: " + parent + ", Left: " + left + ", Right: " + right;
    }

    public void print() {
        System.out.println(data);
    }
}
