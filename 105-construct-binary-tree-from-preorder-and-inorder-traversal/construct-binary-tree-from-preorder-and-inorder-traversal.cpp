class Solution {
public:
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {

        if(preorder.empty()) return nullptr;

        unordered_map<int,int> mp;
        for(int i = 0; i < inorder.size(); i++)
            mp[inorder[i]] = i;

        TreeNode* root = new TreeNode(preorder[0]);

        stack<TreeNode*> st;
        st.push(root);

        for(int i = 1; i < preorder.size(); i++) {

            TreeNode* node = new TreeNode(preorder[i]);

            
            if(mp[preorder[i]] < mp[st.top()->val]) {
                st.top()->left = node;
            }
            else {

                TreeNode* parent = nullptr;

                
                while(!st.empty() &&
                      mp[preorder[i]] > mp[st.top()->val]) {
                    parent = st.top();
                    st.pop();
                }

                parent->right = node;
            }

            st.push(node);
        }

        return root;
    }
};