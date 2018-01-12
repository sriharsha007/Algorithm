/**
 * Created by Viral on 12/31/2017.
 */
public class MergeTrees {
    public static void main(String[] args) {

    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) {
            return t2;
        }
        if(t2 == null) {
            return t1;
        }

        t1.val += t2.val;

        t1.left = mergeTrees(t1.left, t2.left);
        t2.right = mergeTrees(t1.right, t2.right);

        return t1;
    }
}
