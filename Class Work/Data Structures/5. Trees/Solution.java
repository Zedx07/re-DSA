class Solution 
{

    static class Node 
    {
        int key;
        Node left, right;
    };

    static Node newNode(int data) 
    {
        Node temp = new Node();

        temp.key = data;

        temp.left = null;
        temp.right = null;

        return temp;
    }

    static Node insert(Node root, int key) 
    {

        Node newnode = newNode(key);
        Node x = root;

        Node y = null;

        while (x != null) 
        {
            y = x;
            if (key < x.key)
                x = x.left;
            else
                x = x.right;
        }

        if (y == null)
            y = newnode;

        else if (key < y.key)
            y.left = newnode;

        else
            y.right = newnode;
        return y;
    }

    static void Preorder(Node root, String n) 
    {
        if (root == null)
            return;
        else 
        {

            System.out.println(n + " : " + root.key);
            Preorder(root.left, "lefy node");
            Preorder(root.right, "right node");
        }
    }

    // Driver code
    public static void main(String args[]) 
    {
        /*
         * Let us create following BST
         * 50
         * / \
         * 30 70
         * / \ / \
         * 20 40 60 80
         */

        Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        Preorder(root, "root node");

    }
}