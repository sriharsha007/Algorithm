import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by Viral on 12/31/2017.
 */
public class AverageOfLevels {
    public static void main(String[] args) {
        
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Double> res = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            double sum = 0;
            int count = 0;
            Queue<TreeNode> t = new LinkedList<>();
            while (!q.isEmpty()) {
                sum += root.val;
                count ++;
                TreeNode temp = q.poll();
                if(temp.left != null) {
                    t.add(temp.left);
                }
                if(temp.right != null) {
                    t.add(temp.right);
                }
            }
            q = t;
            res.add(sum*1.0 / count);
        }
        return res;
    }
}
