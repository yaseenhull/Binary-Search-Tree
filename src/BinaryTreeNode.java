// Binary Search Tree
// 04 April 2017
// Yaseen Hull

/**
 * Represents a node
 * a node has a key and a value
 */
public class BinaryTreeNode<dataType>
{
   dataType data; //key
   dataType data2; //value
   BinaryTreeNode<dataType> left;
   BinaryTreeNode<dataType> right;
   
   /**
    * sets arguments
    * @param d is key, d2 is value, l is left node, r is right node
    */
   public BinaryTreeNode ( dataType d, dataType d2, BinaryTreeNode<dataType> l, BinaryTreeNode<dataType> r )
   {
      data = d;
      data2 = d2;
      left = l;
      right = r;
   }
   
   /**
    * @return the left node
    */
   BinaryTreeNode<dataType> getLeft ()
    {	
        return left;
    
    }
    
    /**
     * @return the right node
     */
   BinaryTreeNode<dataType> getRight () 
   { 
      return right; 
   }
  
   /**
    * @return the value of the node
    */
    
   public dataType getString()
   {
      return data2;
   }     

}
