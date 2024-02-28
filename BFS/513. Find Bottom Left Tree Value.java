class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        int ans = 0;
        while (!d.isEmpty()) {
            int sz = d.size();
            ans = d.peek().val;
            while (sz-- > 0) {
                TreeNode poll = d.pollFirst();
                if (poll.left != null) d.addLast(poll.left);
                if (poll.right != null) d.addLast(poll.right);
            }
        }
        return ans;
    }
}
【宫水三叶】简单树的遍历运用题
