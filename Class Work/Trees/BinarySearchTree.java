class MakeTree 
{
    static class Node 
    {
        Node left;
        Node right;
        int data;
    };
    
        Node root = null;

        static Node newNode(int data) 
        {
            Node temp = new Node();

            temp.data = data;
            temp.left = null;
            temp.right = null;

            return temp;
        }
    

    static Node insert(Node root, int data) {

        Node newnode = newNode(data);

        Node x = root;
        Node y = null;

        while (x != null) {
            y = x;
            if (data < x.data)
                x = x.left;
            else
                x = x.right;
        }

        if (y == null)
            y = newnode;

        else if (data < y.data)
            y.left = newnode;

        else
            y.right = newnode;

        return y;
    }

    public void displayNode(Node curr, String n) {

        if (curr != null) {
            System.out.println(n + " : " + curr.data);
            if (curr.left != null) {
                displayNode(curr.left, "Left node");
            }
            if (curr.right != null) {
                displayNode(curr.right, "right node");
            }
        }
    }

    public void display() {
        if (root == null) {

        } else {
            displayNode(root, "root node");
        }
    }

}

public class BinarySearchTree 
{
    public static void main(String[] args) 
    {
        MakeTree BST = new MakeTree();
        MakeTree.Node root = null;
        root = MakeTree.insert(root, 50);
        MakeTree.insert(root, 2);
        MakeTree.insert(root, 2);
        MakeTree.insert(root, 2);
        MakeTree.insert(root, 2);

       
        BST.display();

    }
}