package academy.learning.sort.trees;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }


    public void traversePreorder() {
        if (root != null) {
            root.traversePreorder();
        }

    }

    public void traverseInoder() {
        if (root != null) {
            root.traverseInorder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {

            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root == null) {

            System.out.println("empty tree so we just print min integer");
            return Integer.MAX_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            System.out.println("tree empty just print max integer");
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    //return node that replace deleted node,
    //if node is not deleted, then return original node
    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            //move to subtree left child
            //at end we will replace subtree with wutever result of delete is
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));
        } else {
            //delete node that has 1 or 0 child (leaf or 1 child node)
            if (subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight();
            } else if (subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft();
            }

            //if node we want to delete has two children
            //delete from left side - find largest
            //delete from right - find smallest
            subtreeRoot.setData(subtreeRoot.getRight().min());

            //now delete replacement node cuz its moved to replace deleted node
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }

}
