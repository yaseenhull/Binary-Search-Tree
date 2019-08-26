// Binary Search Tree
// 04 April 2017
// Yaseen Hull

public class BinarySearchTree<dataType extends Comparable<? super dataType>> extends BinaryTree<dataType>
{

   /**
    * Inserts key (d) and associated entry (d2) into
    * the Binary Search Tree data structure
    */
   public void insert ( dataType d, dataType d2 )
   {
      if (root == null)
         root = new BinaryTreeNode<dataType> (d,d2, null, null);
      else
         insert (d,d2, root);
   }
   public void insert ( dataType d,dataType d2, BinaryTreeNode<dataType> node )
   {
      if (d.compareTo (node.data) <= 0)
      {
         if (node.left == null)
            node.left = new BinaryTreeNode<dataType> (d,d2, null, null);
         else
            insert (d,d2, node.left);
      }
      else
      {
         if (node.right == null)
            node.right = new BinaryTreeNode<dataType> (d,d2, null, null);
         else
            insert (d,d2, node.right);
      }
   }
   /**
    * visits node and extracts node data to be printed
    * @param node contains key and value of contact
    */
   public void visit( BinaryTreeNode<dataType> node)
   {
      System.out.println( node.data2);
      
   }
   /**
    * dataType d is the name of a phone book contact to be compared
    * with key value of nodes in BST data structure
    * @param d includes first and last name
    */
     
   public BinaryTreeNode<dataType> searchIt ( dataType d )
   {
      if (root == null)
         return null;
      else
         return searchIt(d,root);
   }
   
   /**
    * dataType d is the name of phone book contact and node is the container of key 
    * and value in the BST
    * @return this return the current node
    */
   public  BinaryTreeNode<dataType> searchIt ( dataType d, BinaryTreeNode<dataType> node )
   {
     
      if (d.compareTo (node.data) == 0)
      { 
         return node;
         
      }  
      else if (d.compareTo (node.data) < 0)
      {
         return(node.left == null) ? null : searchIt (d, node.left);
      }
      else
      {
         return(node.right == null) ? null : searchIt (d, node.right);
      }
         
   }
}
