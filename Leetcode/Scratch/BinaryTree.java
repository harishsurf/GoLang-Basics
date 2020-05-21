import java.util.Stack;

public class BinaryTree {

    Node root;

    class Node {
       int val;
       Node left;
       Node right;

       Node(int val){
           this.val = val;
       }
    }

    // left subtree has values <= root.val
    void addNode (int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }
        Node newNode = new Node(key);
        Node temp = root;
        Node prev = root;
        while(temp != null){
            prev = temp;
            if(key <= temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if(key <= prev.val){
            prev.left = newNode;
        } else {
            prev.right = newNode;
        }
    }


    boolean searchNode(int key){
        if (root == null){
            return false;
        }
        Node temp = root;
        while(temp != null && temp.val != key){
            if(key < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if (temp != null) {
            return false;
        }
        return true;
    }

    private void inorderHelper(Node temp){
        if (temp != null){
            inorderHelper(temp.left);
            System.out.printf("%d ", temp.val);
            inorderHelper(temp.right);
        }
    }

    void printInorderRec(){
        if(root == null) {
            System.out.println("empty tree");
            return;
        }
        inorderHelper(root);
    }

    void printIterativeInorder() {
        if(root == null) {
            System.out.println("empty tree");
            return;
        }
        Node curr = root;
        Stack<Node> stk = new Stack<>();
        while(curr != null || !stk.isEmpty()){
            while(curr != null){
                stk.push(curr);
                curr = curr.left;
            }
            Node temp = stk.pop();
            if(temp.right != null){
                curr = temp.right;
            }
            System.out.printf("%d ", temp.val);
        }
    }


    void printIterativePreorder(){
        if(root == null) {
            System.out.println("empty tree");
            return;
        }
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            Node temp = stk.pop();
            if(temp.right != null){
                stk.push(temp.right);
            }
            if(temp.left != null){
                stk.push(temp.left);
            }
            System.out.printf("%d ",temp.val);
        }
    }


    // TODO: printIterativePostOrder()
}