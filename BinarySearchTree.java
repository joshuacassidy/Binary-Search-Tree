public class BinarySearchTree<T extends Comparable<T>> implements IBinarySearchTree {

    private Node<T> root;

    @Override
    public void delete(Comparable key) {
        if (isEmpty()) {
            throw new BinarySearchTreeIsEmptyException("Cannot delete from a empty bst");
        } else {
             delete(root,key);
        }
    }

    @Override
    public Node<T> delete(Node node, Comparable key) {
        if (node == null) {
            return node;
        } else {
            if (node.getData().compareTo(key) > 0) {
                return delete(node.getLeft(), key);
            } else if (node.getData().compareTo(key) < 0) {
                return delete(node.getRight(), key);
            } else {
                if (node.getRight() == null && node.getLeft() == null) {
                    return null;
                } else if (node.getRight() == null) {
                    Node<T> temp = node.getLeft();
                    node =null;
                    return temp;
                } else if (node.getLeft() == null) {
                    Node<T> temp = node.getRight();
                    node = null;
                    return temp;
                } else {
                    Node<T> temp = getPredessor(node.getLeft());
                    node.data = temp.data;
                    node.left = delete(node.getLeft(),temp.getData());
                }
            }
        }
        return node;
    }

    @Override
    public Node getPredessor(Node node) {
        if(node.getRight() != null) {
            return getPredessor(node.getRight());
        }
        return node;
    }

    @Override
    public void insert(Comparable data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            insert(root,data);
        }
    }

    @Override
    public void insert(Node node, Comparable data) {
        if(node.getData().compareTo(data) > 0){
            if (node.getLeft() == null) {
                node.left = new Node<>(data);
            } else {
                insert(node.getLeft(), data);
            }
        } else {
            if (node.getRight() == null) {
                node.right = new Node<>(data);
            } else {
                insert(node.getRight(), data);
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public Node<T> getMax(Node node) {
        if (node.getRight() != null) {
            return getMax(node.getRight());
        }
        return node;
    }

    @Override
    public Node<T> getMin(Node node) {
        if (node.getLeft() != null) {
            return getMin(node.getLeft());
        }
        return node;
    }

    @Override
    public boolean search(Comparable key) {
        if (isEmpty()) {
            throw new BinarySearchTreeIsEmptyException("Can't search for elements in an empty tree.");
        } else {
            return search(root, key);
        }
    }


    @Override
    public boolean search(Node node, Comparable key) {
        if(node == null) {
            return false;
        } else {
            if (node.getData().compareTo(key) < 0) {
                return search(node.getLeft(),key);
            } else if (node.getData().compareTo(key) > 0) {
                return search(node.getRight(),key);
            } else {
                return true;
            }
        }
    }


    @Override
    public void traverse() {
        if (isEmpty()) {
            throw new BinarySearchTreeIsEmptyException("Can't Traverse an empty bst");
        } else {
            postOrderTraversal(root);
        }
    }

    @Override
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            inOrderTraversal(node.getRight());
        }
    }

    @Override
    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getData() + " ");

        }
    }

    @Override
    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public Node<T> getRoot() {
        return root;
    }
}
