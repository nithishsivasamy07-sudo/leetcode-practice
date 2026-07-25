class Solution {
public:
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        deque<vector<int>> dq;
        if(!root) return vector<vector<int>>(dq.begin(),dq.end());

        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()) {
            int size = q.size();
            vector<int>level;
            for(int i=0;i<size;i++) {
                TreeNode*node=q.front();
                q.pop();
                level.push_back(node->val);
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
            }
            dq.push_front(level);
        }
        return vector<vector<int>>(dq.begin(),dq.end());
    }
};