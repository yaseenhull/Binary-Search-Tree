// Binary Search Tree
// 04 April 2017
// Yaseen Hull

public class BinaryTree<dataType>
{  /**
    * The first node is the root node
    */
   BinaryTreeNode<dataType> root;
   
   public BinaryTree ()
   {
      root = null;
   }
   
   public int getHeight ()
   {
      return getHeight (root);
   }   
   public int getHeight ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }
   
   public int getSize ()
   {
      return getSize (root);
   }   
   public int getSize ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }
   /**
    * prints value of data 
    * @param node is the node currently be referred to
    */
    
   public void visit ( BinaryTreeNode<dataType> node )
   {
      System.out.println (node.data2);
   }
   
   public void printIt ()
   {
      printIt (root);
   }
   /**
    * traverses through data structure and prints inorder node data
    * @param node is the node currently be referred to
    */ 
   public void printIt ( BinaryTreeNode<dataType> node )
   {
      if (node != null)
      {
         printIt (node.getLeft ());
         visit (node);
         printIt (node.getRight ());
      }   
   }

 }
