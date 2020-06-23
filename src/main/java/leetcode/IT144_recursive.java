package leetcode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * @author zuoshengli
 **/
public class IT144_recursive {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList();
        preorderTraversal(root, nodes);
        return nodes;
    }

    private void preorderTraversal(TreeNode root, List<Integer> nodes) {
        if (root == null) {
            return;
        }

        nodes.add(root.val);
        preorderTraversal(root.left, nodes);
        preorderTraversal(root.right, nodes);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
