class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> arr = new ArrayList<>();
        helper(ans, root, maxDepth(root));
        return ans;

    }

    public void levelOrder(TreeNode root, int n, List<Integer> arr) {
        if (root == null)
            return;
        // List<Integer> arr = new ArrayList<>();
        if (n == 1)
            arr.add(root.val);
        levelOrder(root.left, n - 1, arr);
        levelOrder(root.right, n - 1, arr);

    }

    public void helper(List<List<Integer>> ans, TreeNode root, int n) {
        int depth = maxDepth(root);
        for (int i = 1; i <= depth; i++) {
            List<Integer> arr = new ArrayList<>();
            levelOrder(root, i, arr);
            ans.add(arr);
        }

    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }
}