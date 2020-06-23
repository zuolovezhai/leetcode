package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zuoshengli
 **/
public class IT114_foreach {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> nodes = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (tmp == null) {
                nodes.add(null);
            } else {
                nodes.add(tmp.val);
            }
            stack.push(tmp.right);
            stack.push(tmp.left);
        }
        return nodes;
    }
}

