package academy.learning.sort.trees;

public class TreeNode {
    private int data;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(int data) {
        this.data = data;

    }

    public void insert(int value) {
        if (value == data) {
            return;
        }
        if (value < data) {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }//19025549
    }

    public void traverseInorder() {
        if (left != null) {
            left.traverseInorder();
        }
        System.out.print("data =  " + data + " , ");
        if (right != null) {
            right.traverseInorder();
        }
    }

    public void traversePreorder(){


        System.out.print("data = "+data+" , ");
        if (left != null) {
            left.traversePreorder();
        }
        if (right != null) {
            right.traversePreorder();
        }
    }

    public TreeNode get(int value) {
        if (value == data) {

            return this;
        }

        if (value < data) {
            if (left != null) {
                return left.get(value);
            }
        } else {
            if (right != null) {
                return right.get(value);
            }
        }

        return null;
    }

    public int min(){
        if (left == null){
            return data;
        }
        else {
            return left.min();
        }
    }

    public int max(){
        if(right == null){
            return data;
        }
        else{
            return right.max();
        }
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                '}';
    }
}
