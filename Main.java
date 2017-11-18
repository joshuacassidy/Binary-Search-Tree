public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(50);
        binarySearchTree.insert(120);
        binarySearchTree.insert(55);
        binarySearchTree.insert(49);
        binarySearchTree.insert(48);
        binarySearchTree.insert(47);
        binarySearchTree.insert(54);
        binarySearchTree.insert(56);
        binarySearchTree.insert(53);
        binarySearchTree.insert(58);
        binarySearchTree.insert(57);
        binarySearchTree.insert(59);
        binarySearchTree.insert(90);
        binarySearchTree.insert(150);
        binarySearchTree.insert(125);
        binarySearchTree.insert(200);
        binarySearchTree.insert(230);
        binarySearchTree.insert(170);
        binarySearchTree.insert(15);
        binarySearchTree.insert(25);
        binarySearchTree.insert(20);
        binarySearchTree.insert(23);
        binarySearchTree.insert(27);
        binarySearchTree.insert(13);
        binarySearchTree.insert(11);
        binarySearchTree.insert(14);
        binarySearchTree.delete(58);
        System.out.println(binarySearchTree.search(47));
        System.out.println(binarySearchTree.getMin(binarySearchTree.getRoot()).getData());
        System.out.println(binarySearchTree.getMax(binarySearchTree.getRoot()).getData());
        binarySearchTree.traverse();
    }
}
