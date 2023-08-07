import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinarySearchTree {

    // caches the sub tree from start -> end
    private Map<Pair, List<TreeNode>> memo = new HashMap<>();
    public List<TreeNode>  getTrees(int start, int end, Map<Pair, List<TreeNode>> memo) {

        if (start > end) {
            List<TreeNode> base = new ArrayList<>();
            base.add(null);
            return base;
        }

        if (memo.containsKey(new Pair(start, end))) {
            return memo.get(new Pair(start, end));
        }

        List<TreeNode> list = new ArrayList<>();  // stores the list of trees
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = getTrees(start, i - 1, memo);
            List<TreeNode> right = getTrees(i + 1, end, memo);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    /*TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                    */
                    list.add(new TreeNode(i, l, r));
                }
            }
        }
        memo.put(new Pair(start, end), list);
        return list;
    }
    public List<TreeNode> generateTrees(int n) {
        int start = 1; // starting node value
        int end = n;   // ending node value

        return getTrees(start, end, memo);
    }
}
