
package BinaryTree;

public class BinaryTreeAPP {
     public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode(60);
        tree.insert(node);
        
        node = new TreeNode(40);
        tree.insert(node);
        
        node = new TreeNode(30);
        tree.insert(node);
        
        node = new TreeNode(50);
        tree.insert(node);
        
        node = new TreeNode(80);
        tree.insert(node);

        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
    }
}
