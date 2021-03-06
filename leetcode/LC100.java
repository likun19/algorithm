package leetcode;

/**
 * author: cshuo
 * date: 2017/8/9
 * version: 1.0
 * description:
 * Given two binary trees, write a function to check if they are equal or not.
 Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class LC100 {
    /**
     * 递归判断子树是否相等.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
