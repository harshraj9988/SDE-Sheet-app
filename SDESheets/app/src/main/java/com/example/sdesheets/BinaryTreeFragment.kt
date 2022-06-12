package com.example.sdesheets

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.sdesheets.databinding.ProblemListviewBinding


class BinaryTreeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = DataBindingUtil.inflate<ProblemListviewBinding>(
            inflater,
            R.layout.problem_listview,
            container,
            false
        )

        val problems = ArrayList<Problem>()
        //Binary Tree
        problems.add(Problem("Inorder Traversal","https://leetcode.com/problems/binary-tree-inorder-traversal/"))
        problems.add(Problem("Preorder Traversal","https://leetcode.com/problems/binary-tree-preorder-traversal/"))
        problems.add(Problem("Postorder Traversal","https://leetcode.com/problems/binary-tree-postorder-traversal/"))
        problems.add(Problem("Morris Inorder Traversal","https://leetcode.com/problems/binary-tree-inorder-traversal/"))
        problems.add(Problem("Morris Preorder Traversal","https://www.geeksforgeeks.org/morris-traversal-for-preorder/"))
        problems.add(Problem("LeftView Of Binary Tree","https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1"))
        problems.add(Problem("Bottom View of Binary Tree","https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1"))
        problems.add(Problem("Top View of Binary Tree","https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1"))
        problems.add(Problem("Preorder inorder postorder in a single traversal","https://bit.ly/3rlXpTX"))
        problems.add(Problem("Vertical order traversal","https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/"))
        problems.add(Problem("Root to node path in a Binary Tree","https://www.interviewbit.com/problems/path-to-given-node/"))
        problems.add(Problem("Max width of a Binary Tree","https://leetcode.com/problems/maximum-width-of-binary-tree/"))
        problems.add(Problem("Level order Traversal / Level order traversal in spiral form","https://leetcode.com/problems/binary-tree-level-order-traversal/"))
        problems.add(Problem("Height of a Binary Tree","https://leetcode.com/problems/maximum-depth-of-binary-tree/"))
        problems.add(Problem("Diameter of Binary Tree","https://leetcode.com/problems/diameter-of-binary-tree/"))
        problems.add(Problem("Check if the Binary tree is height-balanced or not","https://leetcode.com/problems/balanced-binary-tree/"))
        problems.add(Problem("LCA in Binary Tree","https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/"))
        problems.add(Problem("Check if two trees are identical or not","https://leetcode.com/problems/same-tree/"))
        problems.add(Problem("Zig Zag Traversal of Binary Tree","https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/"))
        problems.add(Problem("Boundary Traversal of Binary Tree","https://leetcode.com/problems/boundary-of-binary-tree/#"))
        problems.add(Problem("Maximum path sum","https://leetcode.com/problems/binary-tree-maximum-path-sum/"))
        problems.add(Problem("Construct Binary Tree from inorder and preorder","https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/"))
        problems.add(Problem("Construct Binary Tree from Inorder and Postorder","https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/"))
        problems.add(Problem("Symmetric Binary Tree","https://leetcode.com/problems/symmetric-tree/"))
        problems.add(Problem("Flatten Binary Tree to LinkedList","https://leetcode.com/problems/flatten-binary-tree-to-linked-list/"))
        problems.add(Problem("Check if Binary Tree is the mirror of itself or not","https://practice.geeksforgeeks.org/problems/mirror-tree/1"))
        problems.add(Problem("Check for Children Sum Property","https://bit.ly/33yExIQ"))
        problems.add(Problem("Populate Next Right pointers of Tree","https://leetcode.com/problems/populating-next-right-pointers-in-each-node/"))
        problems.add(Problem("Search given Key in BST","https://leetcode.com/problems/search-in-a-binary-search-tree/"))
        problems.add(Problem("Construct BST from given keys","https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/"))
        problems.add(Problem("Construct BST from preorder traversal","https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/"))
        problems.add(Problem("Check is a BT is BST or not","https://leetcode.com/problems/validate-binary-search-tree/"))
        problems.add(Problem("Find LCA of two nodes in BST","https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/"))
        problems.add(Problem("Find the inorder predecessor/successor of a given Key in BST.","https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1"))
        problems.add(Problem("Floor in a BST","https://www.codingninjas.com/codestudio/problems/floor-from-bst_920457?source=youtube&campaign=Striver_Tree_Videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=Striver_Tree_Videos"))
        problems.add(Problem("Ceil in a BST","https://www.codingninjas.com/codestudio/problems/ceil-from-bst_920464?source=youtube&campaign=Striver_Tree_Videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=Striver_Tree_Videos"))
        problems.add(Problem("Find K-th smallest element in BST","https://leetcode.com/problems/kth-smallest-element-in-a-bst/"))
        problems.add(Problem("Find K-th largest element in BST","https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1"))
        problems.add(Problem("Find a pair with a given sum in BST","https://leetcode.com/problems/two-sum-iv-input-is-a-bst/"))
        problems.add(Problem("BST iterator","https://leetcode.com/problems/binary-search-tree-iterator/"))
        problems.add(Problem("Size of the largest BST in a Binary Tree","https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/"))
        problems.add(Problem("Serialize and deserialize Binary Tree","https://leetcode.com/problems/serialize-and-deserialize-binary-tree/"))
        problems.add(Problem("Binary Tree to Double Linked List","https://leetcode.com/problems/flatten-binary-tree-to-linked-list/"))
        problems.add(Problem("Find median in a stream of running integers.","https://leetcode.com/problems/find-median-from-data-stream/"))
        problems.add(Problem("K-th largest element in a stream.","https://leetcode.com/problems/kth-largest-element-in-a-stream/"))
        problems.add(Problem("Distinct numbers in Window.","https://www.interviewbit.com/problems/distinct-numbers-in-window/"))
        problems.add(Problem("K-th largest element in an unsorted array.","https://leetcode.com/problems/kth-largest-element-in-an-array/"))
        problems.add(Problem("Flood-fill Algorithm","https://leetcode.com/problems/flood-fill/"))



        val adapter = ProblemAdapter(binding.root, problems)

        binding.problemList.adapter = adapter

        binding.invalidateAll()

        binding.problemList.setOnItemClickListener { parent, view, position, id ->
            val problem = adapter.getItem(position)
            val intent = Intent(Intent.ACTION_VIEW, problem!!.url)
            startActivity(intent)
        }
        return binding.root
    }


}