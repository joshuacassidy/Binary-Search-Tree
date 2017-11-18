public interface IBinarySearchTree<T extends Comparable<T>> {
    public void delete(T key);
    public Node<T> delete(Node<T> node, T key);
    public Node<T> getPredessor(Node<T> node);
    public void insert(T data);
    public void insert(Node<T> node, T data);
    public boolean isEmpty();
    public Node<T> getMax(Node<T> node);
    public Node<T> getMin(Node<T> node);
    public boolean search(T key);
    public boolean search(Node node, T key);
    public void traverse();
    public void inOrderTraversal(Node<T> node);
    public void postOrderTraversal(Node<T> node);
    public void preOrderTraversal(Node<T> node);


}
