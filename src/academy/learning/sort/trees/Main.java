package academy.learning.sort.trees;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);
        intTree.traverseInoder();
        System.out.println();


        intTree.traversePreorder();
        System.out.println();

        System.out.println(intTree.get(25));

//        System.out.println(intTree.min());
//        System.out.println(intTree.max());


        int a =2;
        aa(a);
    }
    public static void aa(int a){
        if(a >1){
            return;
        }
    }
}
