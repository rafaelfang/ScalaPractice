/**
 * Created by cfang on 9/29/16.
 */
public class TestBST {
    
    public boolean checkBST(Node node)
    {
        return(isBSTUtil(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    /* Returns true if the given tree is a BST and its
     values are >= min and <= max. */
    private boolean isBSTUtil(Node node, int minVal, int maxVal){
        if(node==null){
            return false;
        }else if(node.data<minVal || node.data>maxVal){
            return false;
        }else{
            return isBSTUtil(node.left, minVal, node.data-1)&&isBSTUtil(node.right, node.data+1, maxVal);
        }




    }

}
