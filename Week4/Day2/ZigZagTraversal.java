class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int depth = maxDepth(root);

        for (int i = 1; i <= depth; i++) {
            List<Integer> arr = new ArrayList<>();
            if (i % 2 == 0) {
                levelOrder2(root, i, arr);
            } else {
                levelOrder(root, i, arr);
            }
            ans.add(arr);
        }

        return ans;
    }

    public void levelOrder(TreeNode root, int n, List<Integer> arr) {
        if (root == null) return;

        if (n == 1) {
            arr.add(root.val);
            return;
        }

        levelOrder(root.left, n - 1, arr);
        levelOrder(root.right, n - 1, arr);
    }

    public void levelOrder2(TreeNode root, int n, List<Integer> arr) {
        if (root == null) return;

        if (n == 1) {
            arr.add(root.val);
            return;
        }

        levelOrder2(root.right, n - 1, arr);
        levelOrder2(root.left, n - 1, arr);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}